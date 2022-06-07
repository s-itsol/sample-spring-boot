package net.sitsol.samplespringboot.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.sitsol.samplespringboot.bean.dto.qiita.QiitaSchema;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
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

    @NonNull
    private final SampleService sampleService;

    private static final String EXTERNAL_RESOURCE_URL = "https://qiita.com/api/v2/schema";

    /**
     * サンプルサービス呼出
     */
    public void callSample() {
        // 呼出確認
        sampleService.callConf(this.getClass().getSimpleName());
    }

    /**
     * キータAPIスキーマ取得
     */
    public void getQiitaApiSchema() {

        log.info("キータAPIスキーマ取得 - URL：[" + EXTERNAL_RESOURCE_URL + "]");

        ResponseEntity<QiitaSchema> response = restTemplate.exchange(
                                                            EXTERNAL_RESOURCE_URL
                                                            , HttpMethod.GET
                                                            , null
                                                            , QiitaSchema.class
        );

        QiitaSchema dto = response.getBody();

        log.info("▼▼▼▼▼ 取得結果 ▼▼▼▼▼");
        log.info("description：[" + dto.getDescription() + "]");
        log.info("properties-template-discription：[" + dto.getProperties().getTemplate().getDescription()+ "]");
        log.info("properties-user-discription：[" + dto.getProperties().getUser().getDescription() + "]");
        log.info("required：[" + StringUtils.arrayToCommaDelimitedString(dto.getRequired()) + "]");
        log.info("title：[" + dto.getTitle() + "]");
        log.info("▲▲▲▲▲ 取得結果 ▲▲▲▲▲");

        // ※Chromeで確認した内容と違い、文章が英語になっていた。
        //   おそらく、HTTPヘッダで「日本」という情報が要るのだと思うが、そこを検証したい訳ではないので、そこは諦める。
    }
}
