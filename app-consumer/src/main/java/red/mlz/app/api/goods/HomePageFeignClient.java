package red.mlz.app.api.goods;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import red.mlz.common.utils.Response;

@FeignClient(name="app-provider")
public interface HomePageFeignClient {

    @RequestMapping("/home")
    Response HomePage();



}
