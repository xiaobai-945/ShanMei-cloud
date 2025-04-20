package red.mlz.app.controller.goods;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import red.mlz.app.api.goods.GoodsFeignClient;
import red.mlz.common.utils.Response;

import javax.annotation.Resource;
import java.math.BigInteger;


@RestController
public class GoodsController {

    @Resource
    private GoodsFeignClient goodsFeignClient;

    /**
     * 类目列表
     */

    @RequestMapping("/goods/category_list")
    public Response getCategoryAll() {

        return goodsFeignClient.getCategoryAll();

    }

    @RequestMapping("/goods/category_goods")
    public Response getCategoryGoodsItem(@RequestParam(name = "categoryId", required = false) BigInteger categoryId,
                                                @RequestParam(name = "wp", required = false) String wp) {

        return goodsFeignClient.getCategoryGoodsItem(categoryId, wp);

    }


    @RequestMapping("/goods/list")
    public Response getGoodsAll(@RequestParam(name = "keyword", required = false) String keyword,
                               @RequestParam(name = "wp", required = false) String wp) {

        return goodsFeignClient.getGoodsAll(keyword, wp);
    }

    @RequestMapping("/goods/new_list")
    public Response getGoodsList(@RequestParam(name = "keyword", required = false) String keyword,
                                @RequestParam(name = "wp", required = false) String wp) {


        return goodsFeignClient.getGoodsList(keyword, wp);

    }

    @RequestMapping("/goods/info")
    public Response goodsInfo(@RequestParam(name = "goodsId") BigInteger goodsId) {
        return goodsFeignClient.goodsInfo(goodsId);
    }

}
