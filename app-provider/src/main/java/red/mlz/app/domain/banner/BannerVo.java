package red.mlz.app.domain.banner;

import lombok.Data;
import lombok.experimental.Accessors;
import red.mlz.app.domain.banner.BannerItemVo;

import java.util.List;

@Data
@Accessors(chain = true)
public class BannerVo {
    private List<BannerItemVo> bannerList;

}
