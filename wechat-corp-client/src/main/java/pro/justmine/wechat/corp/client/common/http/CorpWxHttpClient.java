package pro.justmine.wechat.corp.client.common.http;

import org.springframework.web.reactive.function.client.WebClient;

public class CorpWxHttpClient {
    private final WebClient webClient;

    public CorpWxHttpClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public WebClient getWebClient() {
        return webClient;
    }

}
