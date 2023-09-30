package pro.justmine.wechat.corp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.justmine.wechat.corp.client.CorpWxClient;

@SpringBootApplication
public class WechatCorpClientApplication {

    public static void main(String[] args) {
        CorpWxClient.CorpWxClientConfig config = new CorpWxClient.CorpWxClientConfig(
                "wwc0", "", "", "");
        SpringApplication.run(WechatCorpClientApplication.class, args);
    }

}
