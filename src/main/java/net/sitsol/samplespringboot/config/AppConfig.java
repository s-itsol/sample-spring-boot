package net.sitsol.samplespringboot.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Configuration
@Slf4j
public class AppConfig {

    /**
     * RestTemplateインスタンス生成
     * @return RestTemplateクラスのインスタンス
     */
    @Bean
    public RestTemplate createRestTemplate() {

        RestTemplate retObj = new RestTemplate();

        log.info("RestTemplateインスタンス生成 - ハッシュ値：[" + retObj.hashCode() + "]");

        return retObj;
    }
}
