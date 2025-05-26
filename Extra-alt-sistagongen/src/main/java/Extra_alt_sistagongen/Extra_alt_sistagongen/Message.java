package Extra_alt_sistagongen.Extra_alt_sistagongen;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private String sender;
    private String content;
    private MsgType type;
}
