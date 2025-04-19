package red.mlz.common.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import red.mlz.common.domain.banner.BannerVo;
import red.mlz.common.domain.channel.ChannelVo;
import red.mlz.common.domain.event.EventVo;

@Data
@Accessors(chain = true)
public class HomePageVo {
    private BannerVo banner;
    private ChannelVo channel;
    private EventVo event;
    private BaseListVo goodsList;

}
