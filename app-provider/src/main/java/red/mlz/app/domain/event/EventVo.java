package red.mlz.app.domain.event;

import lombok.Data;
import red.mlz.app.domain.event.EventItemVo;

import java.util.List;

@Data
public class EventVo {
    private List<EventItemVo> eventListVo;

}
