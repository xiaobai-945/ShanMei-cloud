package red.mlz.app.controller.goods;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import red.mlz.app.api.goods.HomePageFeignClient;

import red.mlz.common.utils.Response;

import javax.annotation.Resource;

@RestController
public class HomePageController {
    @Resource
    private HomePageFeignClient homePageFeignClient;

    @RequestMapping("/home")
    public Response HomePage(){

        return homePageFeignClient.HomePage();
    }



}
