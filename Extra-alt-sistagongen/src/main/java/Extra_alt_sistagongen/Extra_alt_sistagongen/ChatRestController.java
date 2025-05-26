package Extra_alt_sistagongen.Extra_alt_sistagongen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatRestController {

    private List<Message> messages = new ArrayList<>();

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }

    @PostMapping("/message")
    public Message postMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
    }
}
