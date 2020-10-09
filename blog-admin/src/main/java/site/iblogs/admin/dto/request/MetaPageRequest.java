package site.iblogs.admin.dto.request;

import lombok.Data;
import site.iblogs.common.api.PageRequest;
import site.iblogs.common.model.MetaType;

@Data
public class MetaPageRequest extends PageRequest {
    private MetaType type;
}
