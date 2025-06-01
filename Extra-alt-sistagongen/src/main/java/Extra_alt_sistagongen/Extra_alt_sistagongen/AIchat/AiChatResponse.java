package Extra_alt_sistagongen.Extra_alt_sistagongen.AIchat;

import java.util.List;

import Extra_alt_sistagongen.Extra_alt_sistagongen.Message;

public class AiChatResponse {

    private List<Choice> choices;

    public AiChatResponse() {
    };

    public List<Choice> getcChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    };

    public static class Choice {
        private Message message;

        public Choice() {
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }

    }
}
