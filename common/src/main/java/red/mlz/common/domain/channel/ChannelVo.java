package red.mlz.common.domain.channel;

import lombok.Data;
import lombok.experimental.Accessors;
import red.mlz.common.domain.channel.ChannelItemVo;

import java.util.List;

@Data
@Accessors(chain = true)
public class ChannelVo {
    private List<ChannelItemVo> channelItemVos;
}
