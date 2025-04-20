package red.mlz.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import red.mlz.common.utils.Response;

import javax.servlet.http.HttpSession;


@FeignClient(name="auth-provider")
public interface ConsoleUserFeignClient {


    @RequestMapping("/user/login/web")
    public Response loginWeb(
                             HttpSession httpSession,
                             @RequestParam(name = "phone") String phone,
                             @RequestParam(name = "password") String password,
                             @RequestParam(name = "remember") boolean remember) ;

}
