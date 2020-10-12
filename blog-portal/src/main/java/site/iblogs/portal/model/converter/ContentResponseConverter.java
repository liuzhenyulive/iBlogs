package site.iblogs.portal.model.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import site.iblogs.model.Content;
import site.iblogs.common.dto.response.ContentResponse;

@Mapper(componentModel = "spring")
public interface ContentResponseConverter {
    @Mappings({
            @Mapping(target = "type", expression = "java(site.iblogs.common.dto.enums.ContentType.values()[contents.getType()])"),
            @Mapping(target = "status", expression = "java(site.iblogs.common.dto.enums.ContentStatus.values()[contents.getStatus()])"),
            @Mapping(target = "allowComment", expression = "java(contents.getAllowcomment())"),
            @Mapping(target = "allowFeed", expression = "java(contents.getAllowfeed())"),
            @Mapping(target = "allowPing", expression = "java(contents.getAllowping())")
    })
    ContentResponse domain2dto(Content contents);
}
