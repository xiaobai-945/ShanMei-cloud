package red.mlz.app.controller.user;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import red.mlz.app.api.user.UserFeignClient;
import red.mlz.common.module.user.entity.User;
import red.mlz.common.utils.Response;

import javax.annotation.Resource;


@RestController
@Slf4j
public class UserController {

    @Resource
    private UserFeignClient userFeignClient;


    @RequestMapping("/user/login/app")
    public Response loginApp( User loginUser,
                             @RequestParam(name = "phone") String phone,
                             @RequestParam(name = "password") String password) {
        return userFeignClient.loginApp(loginUser, phone, password);
    }

    @RequestMapping("/user/register/app")
    public Response registerApp(User loginUser,
                                @RequestParam(name = "phone") String phone,
                                @RequestParam(name = "gender") Integer gender,
                                @RequestParam(name = "avatar", required = false) String avatar,
                                @RequestParam(name = "name") String name,
                                @RequestParam(name = "password") String password,
                                @RequestParam(name = "country", required = false) String country,
                                @RequestParam(name = "province", required = false) String province,
                                @RequestParam(name = "city", required = false) String city) {
        return userFeignClient.registerApp(loginUser, phone, gender, avatar, name, password, country, province, city);
    }
}
