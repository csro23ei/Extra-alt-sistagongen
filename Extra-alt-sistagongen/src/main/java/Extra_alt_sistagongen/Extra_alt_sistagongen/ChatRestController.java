package Extra_alt_sistagongen.Extra_alt_sistagongen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatRestController {

    private final MessageRepository messageRepository;

    public ChatRestController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    @PostMapping("/message")
    public Message postMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
}
