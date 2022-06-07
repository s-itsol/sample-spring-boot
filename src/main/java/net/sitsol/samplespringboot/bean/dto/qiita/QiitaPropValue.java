package net.sitsol.samplespringboot.bean.dto.qiita;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 *
 */
@JsonIgnoreProperties( ignoreUnknown = true )
@Data
public class QiitaPropValue {

    private String description;
    // 「links」は長いので読み飛ばす
    private String[] required;
    private String title;

}
