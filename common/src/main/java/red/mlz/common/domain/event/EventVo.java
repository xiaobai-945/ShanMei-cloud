package red.mlz.common.domain.event;

import lombok.Data;
import red.mlz.common.domain.event.EventItemVo;

import java.util.List;

@Data
public class EventVo {
    private List<EventItemVo> eventListVo;

}
