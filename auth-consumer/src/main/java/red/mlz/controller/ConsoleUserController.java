package red.mlz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import red.mlz.api.ConsoleUserFeignClient;
import red.mlz.common.utils.Response;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@RestController
@Slf4j
public class ConsoleUserController {
    @Resource
    private ConsoleUserFeignClient consoleUserFeignClient;


    @RequestMapping("/user/login/web")
    public Response loginWeb(
                             HttpSession httpSession,
                             @RequestParam(name = "phone") String phone,
                             @RequestParam(name = "password") String password,
                             @RequestParam(name = "remember") boolean remember) {


        return consoleUserFeignClient.loginWeb(httpSession, phone, password, remember);
    }

}
