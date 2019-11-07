package pandalife.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class NikeAuthComponent {
    private final RestTemplate restTemplate;

    public NikeAuthComponent(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void authenticate() {
        ResponseEntity<String> html = restTemplate.getForEntity("https://www.nike.com", String.class);
        log.info(html.getBody());
        log.info(html.getHeaders().toString());
    }
}
