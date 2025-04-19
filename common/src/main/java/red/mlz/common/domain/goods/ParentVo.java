package red.mlz.common.domain.goods;

import lombok.Data;
import lombok.experimental.Accessors;
import red.mlz.common.domain.goods.ParentCategoryVo;

import java.util.List;

@Data
@Accessors(chain = true)
public class ParentVo {

    private List<ParentCategoryVo> parentList;
}
