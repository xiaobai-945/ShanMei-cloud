package red.mlz.console.controller.goods;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import red.mlz.common.utils.Response;
import red.mlz.console.api.goods.ConsoleGoodsFeignClient;

import javax.annotation.Resource;
import java.math.BigInteger;


@RestController
public class ConsoleGoodsController {
    @Resource
    private ConsoleGoodsFeignClient consoleGoodsFeignClient;


    @RequestMapping("goods/console_list")
    public Response getConsoleAll(@RequestParam(name = "keyword", required = false) String keyword,
                                  @RequestParam(name = "page", defaultValue = "1") int page) {


        return consoleGoodsFeignClient.getConsoleAll(keyword, page);
    }

    @RequestMapping("/goods/console_info")
    public Response consoleInfoVo(@RequestParam(name = "goodsId") BigInteger goodsId) {

        return consoleGoodsFeignClient.consoleInfoVo(goodsId);

    }

    @RequestMapping("/goods/console/categories/tree")
    public Response categoryTree() {

        return consoleGoodsFeignClient.categoryTree();
    }


    @RequestMapping("/goods/add")
    public Response addGoods(@RequestParam(name = "goodsId", required = false) BigInteger goodsId,
                             @RequestParam(name = "categoryId") BigInteger categoryId,
                             @RequestParam(name = "title") String title,
                             @RequestParam(name = "goodsImages") String goodsImages,
                             @RequestParam(name = "sales") Integer sales,
                             @RequestParam(name = "goodsName") String goodsName,
                             @RequestParam(name = "price") Integer price,
                             @RequestParam(name = "source") String source,
                             @RequestParam(name = "sevenDayReturn") Integer sevenDayReturn,
                              @RequestParam(name = "goodsDetails",required = false) String goodsDetails,
                             @RequestParam(name = "tags") String tagNames) {


        return consoleGoodsFeignClient.addGoods(goodsId, categoryId, title, goodsImages,
                sales, goodsName, price, source, sevenDayReturn, goodsDetails, tagNames);

    }

    @RequestMapping("/goods/update")
    public Response updateGoods(@RequestParam(name = "goodsId") BigInteger goodsId,
                                @RequestParam(name = "categoryId") BigInteger categoryId,
                                @RequestParam(name = "title") String title,
                                @RequestParam(name = "goodsImages") String goodsImages,
                                @RequestParam(name = "sales") Integer sales,
                                @RequestParam(name = "goodsName") String goodsName,
                                @RequestParam(name = "price") Integer price,
                                @RequestParam(name = "source") String source,
                                @RequestParam(name = "sevenDayReturn") Integer sevenDayReturn,
                                @RequestParam(name = "goodsDetails",required = false) String goodsDetails,
                                @RequestParam(name = "tags", required = false) String tagNames) {


        return consoleGoodsFeignClient.updateGoods(goodsId, categoryId, title, goodsImages,
                sales, goodsName, price, source, sevenDayReturn, goodsDetails, tagNames);

    }

    @RequestMapping("/goods/delete")
    public Response goodsDelete(@RequestParam(name = "goodsId") BigInteger goodsId) {

        return consoleGoodsFeignClient.goodsDelete(goodsId);

    }
}


