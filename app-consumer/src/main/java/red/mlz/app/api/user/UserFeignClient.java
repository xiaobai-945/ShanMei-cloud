package red.mlz.app.api.user;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import red.mlz.common.module.user.entity.User;
import red.mlz.common.utils.Response;


@FeignClient(name="app-provider")
public interface UserFeignClient {



    @RequestMapping("/user/login/app")
    Response loginApp(User loginUser,
                      @RequestParam(name = "phone") String phone,
                      @RequestParam(name = "password") String password) ;

    @RequestMapping("/user/register/app")
    Response registerApp(User loginUser,
                         @RequestParam(name = "phone") String phone,
                         @RequestParam(name = "gender") Integer gender,
                         @RequestParam(name = "avatar", required = false) String avatar,
                         @RequestParam(name = "name") String name,
                         @RequestParam(name = "password") String password,
                         @RequestParam(name = "country", required = false) String country,
                         @RequestParam(name = "province", required = false) String province,
                         @RequestParam(name = "city", required = false) String city) ;
}
