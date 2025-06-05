package Extra_alt_sistagongen.Extra_alt_sistagongen.AIchat;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AiChatService {

    private final RestTemplate restTemplate;
    private final OpenAiProperties properties;

    public AiChatService(RestTemplate restTemplate, OpenAiProperties properties) {
        this.restTemplate = restTemplate;
        this.properties = properties;
    }

    public AiChatResponse sendChatResponse(String prompt) {
        AiChatRequest chatRequest = new AiChatRequest(
                "gpt-3.5-turbo",
                "You are a helpful assistant and a programmer + very funny",
                prompt, 1);

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(properties.getApiKey());
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<AiChatRequest> entity = new HttpEntity<>(chatRequest, headers);

        return restTemplate.postForObject(properties.getApiUrl(), entity, AiChatResponse.class);
    }
}
