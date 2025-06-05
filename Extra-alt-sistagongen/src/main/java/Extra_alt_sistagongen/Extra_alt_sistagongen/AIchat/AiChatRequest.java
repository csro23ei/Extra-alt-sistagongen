package Extra_alt_sistagongen.Extra_alt_sistagongen.AIchat;

import java.util.ArrayList;
import java.util.List;

public class AiChatRequest {

    private String model;

    private List<AiMessages> messages; // note: changed to plural "messages"

    private int n;

    public AiChatRequest(String model, String systemPrompt, String userPrompt, int n) {
        this.model = model;
        this.n = n;
        this.messages = new ArrayList<>();
        this.messages.add(new AiMessages("system", systemPrompt)); // system message
        this.messages.add(new AiMessages("user", userPrompt)); // user message
    }

    // getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<AiMessages> getMessages() {
        return messages;
    }

    public void setMessages(List<AiMessages> messages) {
        this.messages = messages;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
