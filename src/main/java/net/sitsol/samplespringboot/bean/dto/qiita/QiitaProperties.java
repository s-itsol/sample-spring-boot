package net.sitsol.samplespringboot.bean.dto.qiita;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 「キータプロパティ群」クラス
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@Data
public class QiitaProperties {

    private QiitaPropValue template;
    private QiitaPropValue user;
    // 他のプロパティは長いので読み飛ばす

}
