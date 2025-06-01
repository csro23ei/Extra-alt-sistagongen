package Extra_alt_sistagongen.Extra_alt_sistagongen.AIchat;

import java.util.ArrayList;
import java.util.List;

public class AiChatRequest {

    private String model;

    private List<AiMessages> message;

    private int n;

    public AiChatRequest(String model, String promt, int n) {
        this.model = model;
        this.message = new ArrayList<>();
        this.message.add(new AiMessages("user", promt));
        this.n = n;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<AiMessages> getMessage() {
        return message;
    }

    public void setMessage(List<AiMessages> message) {
        this.message = message;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
