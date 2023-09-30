package pro.justmine.wechat.corp.client.common.http;

import org.springframework.web.reactive.function.client.WebClient;
import pro.justmine.wechat.corp.client.CorpWxClient;

public interface CorpWechatHttpModule {

    WebClient webClient();

    CorpWxClient.CorpWxClientConfig clientConfig();

    default String getAccessToken() {
        return "clientConfig().getAccessToken()";
    }

    <T> T authedPost(String url, Object request, Class<T> responseType);

    <T> T authedGet(String url, Class<T> responseType);

}
