package net.sitsol.samplespringboot.bean.dto.qiita;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 「キータスキーマ」クラス
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@Data
public class QiitaSchema {

    private String description;
    private QiitaProperties properties;
    private String[] required;
    private String title;

}
