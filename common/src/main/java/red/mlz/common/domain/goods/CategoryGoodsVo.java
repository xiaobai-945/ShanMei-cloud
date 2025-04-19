package red.mlz.common.domain.goods;

import lombok.Data;
import lombok.experimental.Accessors;
import red.mlz.common.domain.BaseListVo;
import red.mlz.common.domain.goods.CategoryVo;

import java.util.List;

@Data
@Accessors(chain = true)
public class CategoryGoodsVo {
    private List<CategoryVo> categories;  // 类目列表
    private BaseListVo goodsItem;    // 商品列表分页信息
}
