package pro.justmine.wechat.corp.client.common.http;

import org.springframework.web.reactive.function.client.WebClient;
import pro.justmine.wechat.corp.client.CorpWxClient;

public interface CorpWechatAccessTokenModule extends CorpWechatHttpModule {

    WebClient webClient();

    CorpWxClient.CorpWxClientConfig clientConfig();

    default String getAccessToken() {
        return "";
    }


}
