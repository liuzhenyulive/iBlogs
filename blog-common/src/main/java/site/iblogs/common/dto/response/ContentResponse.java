package site.iblogs.common.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.iblogs.common.dto.enums.ContentStatus;
import site.iblogs.common.dto.enums.ContentType;

import java.util.Date;

/**
 * 文章API响应实体
 *
 * @author Liu Zhenyu on 3/22/2020
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContentResponse {
    private Long id;
    private String title;
    private String slug;
    private Date modified;
    private String content;
    private int hits;
    private ContentType type;
    private String FmtType;
    private String ThumbImg;
    private String Tags;
    private String Category;
    private ContentStatus Status;
    private int CommentsNum;
    private Boolean allowComment;
    private Boolean allowPing;
    private Boolean allowFeed;
    private String Author;
    private Date Created;
    private Long Pre;
    private Long Next;
    private String description;
}
