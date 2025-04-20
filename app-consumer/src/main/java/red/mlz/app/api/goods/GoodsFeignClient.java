package red.mlz.app.api.goods;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import red.mlz.common.utils.Response;

import java.math.BigInteger;


@FeignClient(name="app-provider")
public interface GoodsFeignClient {


    /**
     * 类目列表
     */

    @RequestMapping("/goods/category_list")
    Response getCategoryAll();

    @RequestMapping("/goods/category_goods")
    Response getCategoryGoodsItem(@RequestParam(name = "categoryId", required = false) BigInteger categoryId,
                                  @RequestParam(name = "wp", required = false) String wp);


    @RequestMapping("/goods/list")
    Response getGoodsAll(@RequestParam(name = "keyword", required = false) String keyword,
                         @RequestParam(name = "wp", required = false) String wp);

    @RequestMapping("/goods/new_list")
    Response getGoodsList(@RequestParam(name = "keyword", required = false) String keyword,
                          @RequestParam(name = "wp", required = false) String wp);

    @RequestMapping("/goods/info")
    Response goodsInfo(@RequestParam(name = "goodsId") BigInteger goodsId);

}
