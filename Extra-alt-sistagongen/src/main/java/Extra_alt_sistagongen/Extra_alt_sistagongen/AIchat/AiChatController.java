package Extra_alt_sistagongen.Extra_alt_sistagongen.AIchat;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = { "http://localhost:3000", "https://coral-app-sym8r.ondigitalocean.app",
        "http://localhost:5173" })
public class AiChatController {

    @Autowired
    private AiChatService chatService;

    @PostMapping("/chatAi")
    public CompletableFuture<String> postChat(@RequestBody String prompt) {
        System.out.println("Prompt received: " + prompt); // logga input
        return CompletableFuture.supplyAsync(() -> {
            AiChatResponse response = chatService.sendChatResponse(prompt);
            if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
                throw new RuntimeException("No choices received from OpenAI");
            }
            return response.getChoices().get(0).getMessage().getContent();
        });
    }

}
