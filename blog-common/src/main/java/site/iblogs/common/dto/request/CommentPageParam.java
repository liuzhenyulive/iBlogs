package site.iblogs.common.dto.request;

import lombok.Data;
import site.iblogs.common.api.PageRequest;

/**
 * @author: liuzhenyulive@live.com
 * @date: 10/12/2020 23:12
 */
@Data
public class CommentPageParam extends PageRequest {
    private Long contentId;
}
