package net.sitsol.samplespringboot.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * キータサービス
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class QiitaService {

    @NonNull
    private final RestTemplate restTemplate;

    private static final String EXTERNAL_RESOURCE_URL = "https://qiita.com/api/v2/schema";

    /**
     * キータAPIスキーマ取得
     * @return 結果文字列
     */
    public String getQiitaApiSchema() {

        log.info("キータAPIスキーマ取得 - URL：[" + EXTERNAL_RESOURCE_URL + "]");

        ResponseEntity<String> response = restTemplate.exchange(
                                                    EXTERNAL_RESOURCE_URL
                                                    , HttpMethod.GET
                                                    , null
                                                    , String.class
        );

        return response.getBody();
    }
}
