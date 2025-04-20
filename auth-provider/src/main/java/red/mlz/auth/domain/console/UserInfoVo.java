package red.mlz.auth.domain.console;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserInfoVo {
    private String userName;
    private Integer userGender;
    private String userPhone;
    private String userAvatar;
}
