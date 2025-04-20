package red.mlz.console.api.user;

import com.alibaba.fastjson.JSON;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import red.mlz.common.utils.Response;

import javax.servlet.http.HttpSession;


@FeignClient(name="consoler-provider")
public interface ConsoleUserFeignClient {


    @RequestMapping("/user/login/web")
    public Response loginWeb(
                             HttpSession httpSession,
                             @RequestParam(name = "phone") String phone,
                             @RequestParam(name = "password") String password,
                             @RequestParam(name = "remember") boolean remember) ;

}
