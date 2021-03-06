package site.iblogs.portal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.Renderer;
import org.commonmark.renderer.html.HtmlRenderer;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.iblogs.common.api.PageResponse;
import site.iblogs.common.dto.ConfigKey;
import site.iblogs.mapper.ContentMapper;
import site.iblogs.model.Content;
import site.iblogs.model.ContentExample;
import site.iblogs.portal.dao.ContentDao;
import site.iblogs.common.conventer.ContentResponseConverter;
import site.iblogs.portal.model.params.ArticleParam;
import site.iblogs.portal.model.response.ArchivesResponse;
import site.iblogs.common.dto.response.ContentResponse;
import site.iblogs.portal.service.ContentService;
import site.iblogs.portal.service.OptionService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;
import java.util.stream.Collectors;


/**
 * 内容服务实现类
 *
 * @author Liu Zhenyu on 3/11/2020
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentsMapper;

    @Autowired
    private ContentResponseConverter contentResponseConverter;

    @Autowired
    private OptionService optionService;

    @Autowired
    private ContentDao contentDao;

    @Override
    public List<Content> getTopContent(Integer topNum,boolean containContent) {
        if(topNum!=null){
            PageHelper.startPage(1, topNum);
        }
        ContentExample contentsExample = new ContentExample();
        contentsExample.createCriteria().andDeletedEqualTo(false);
        contentsExample.setOrderByClause("Created desc");
        if(containContent){
            List<Content> contents = contentsMapper.selectByExampleWithBLOBs(contentsExample);
            return contents.stream().peek(value-> value.setContent(parseMarkdownToHtml(value.getContent()))).collect(Collectors.toList());
        }else {
            return  contentsMapper.selectByExample(contentsExample);
        }
    }

    @Override
    public List<Content> findArticles(ArticleParam param) {
        return null;
    }

    @Override
    public PageResponse<ContentResponse> listContent(int pageNum, int pageSize, String orderType, Boolean summary) {
        PageHelper.startPage(pageNum, pageSize);
        ContentExample contentsExample = new ContentExample();
        contentsExample.createCriteria().andDeletedEqualTo(false);
        switch (orderType) {
            case "hot":
                contentsExample.setOrderByClause("Hits desc");
                break;
            case "random":
                contentsExample.setOrderByClause("RAND()");
                break;
            default:
                contentsExample.setOrderByClause("Created desc");
        }
        List<Content> contents = contentsMapper.selectByExampleWithBLOBs(contentsExample);
        PageInfo<Content> pageInfo = new PageInfo<>(contents);
        if (summary) {
            return getContentResponsePageResponse(contents, pageInfo);
        }
        return PageResponse.restPage(contents.stream().peek(u -> u.setContent(parseMarkdownToHtml(u.getContent()))).map(u -> contentResponseConverter.domain2dto(u)).collect(Collectors.toList()), pageInfo);
    }

    public ContentResponse getByUrl(String url) {
        ContentExample example = new ContentExample();
        ContentExample.Criteria criteria = example.createCriteria();
        criteria.andDeletedEqualTo(false);
        try {
            Long id = Long.parseLong(url);
            criteria.andIdEqualTo(id);
        } catch (NumberFormatException ignored) {
            criteria.andSlugEqualTo(url);
        }
        Optional<Content> contents = contentsMapper.selectByExampleWithBLOBs(example).stream().peek(u -> {
            u.setContent(parseMarkdownToHtml(u.getContent()));
        }).findFirst();
        return contents.map(value -> {
            ContentResponse response = contentResponseConverter.domain2dto(value);
            String contentText = Jsoup.parse(response.getContent()).body().text();
            int contentLength = contentText.length();
            contentLength = Math.min(getMaxIntroCount(), contentLength);
            response.setDescription(contentText.substring(0, contentLength - 1));
            response.setPre(contentDao.getPre(value.getId()));
            response.setNext(contentDao.getNext(value.getId()));
            return response;
        }).orElse(null);
    }

    @Override
    public PageResponse<ContentResponse> getContentByMetaData(int type, String name, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Content> contents = contentDao.getContentByMetaData(type, name);
        PageInfo<Content> pageInfo = new PageInfo<>(contents);
        return getContentResponsePageResponse(contents, pageInfo);
    }

    @Override
    public PageResponse<ContentResponse> getContentByArchive(Date date, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        ft.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        List<Content> contents = contentDao.getContentByArchive(ft.format(date));
        PageInfo<Content> pageInfo = new PageInfo<>(contents);
        return getContentResponsePageResponse(contents, pageInfo);
    }

    @Override
    public List<ArchivesResponse> contentArchives() {
        return contentDao.getArchives();
    }

    private PageResponse<ContentResponse> getContentResponsePageResponse(List<Content> contents, PageInfo<Content> pageInfo) {
        final int lengthFinal = getMaxIntroCount();
        return PageResponse.restPage(contents.stream().peek(u -> {
            u.setContent(parseMarkdownToHtml(u.getContent()));
            String contentText = Jsoup.parse(u.getContent()).body().text();
            int contentLength = contentText.length();
            contentLength = Math.min(lengthFinal, contentLength);
            u.setContent(contentText.substring(0, contentLength - 1));
        }).map(u -> contentResponseConverter.domain2dto(u)).collect(Collectors.toList()), pageInfo);
    }

    private int getMaxIntroCount() {
        int length;
        try {
            length = Integer.parseInt(optionService.getOption(ConfigKey.MaxIntroCount).getValue());
        } catch (Exception e) {
            length = 200;
        }
        return length;
    }

    private static Parser parser;
    private static Renderer renderer;

    private String parseMarkdownToHtml(String markdown) {
        if (parser == null) {
            parser = Parser.builder().build();
        }
        if (renderer == null) {
            renderer = HtmlRenderer.builder().build();
        }
        Node document = parser.parse(markdown);
        return renderer.render(document);  // "<p>This is <em>Sparta</em></p>\n"
    }
}
