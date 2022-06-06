package net.sitsol.samplespringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Configuration
public class AppConfig {

    /**
     * RestTemplateインスタンス取得
     * @return RestTemplateクラスのインスタンス
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
