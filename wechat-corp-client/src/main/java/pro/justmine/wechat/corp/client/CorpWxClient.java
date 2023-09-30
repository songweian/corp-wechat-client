package pro.justmine.wechat.corp.client;

import lombok.Builder;
import org.springframework.web.reactive.function.client.WebClient;
import pro.justmine.wechat.corp.client.accesstoken.AccessTokenModule;
import pro.justmine.wechat.corp.client.basic.accountid.AccountIdModule;

@Builder
public class CorpWxClient {

    private final WebClient webClient;
    private final CorpWxClientConfig config;
    private final AccessTokenModule accessToken;

    public record CorpWxClientConfig(String corpId, String corpSecret, String corpContactSecret,
                                     String externalUserSecret) {
    }

    @Builder
    public static class BasicModule {
        private final WebClient webClient;
        private final CorpWxClientConfig config;

        private final AccountIdModule accountIdModule;
    }


}
