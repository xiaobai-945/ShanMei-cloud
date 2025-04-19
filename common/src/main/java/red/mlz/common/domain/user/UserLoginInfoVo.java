package red.mlz.common.domain.user;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserLoginInfoVo {
    private UserInfoVo userInfo;
    private String sign;
}
