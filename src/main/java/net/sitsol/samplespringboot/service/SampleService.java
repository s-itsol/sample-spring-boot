package net.sitsol.samplespringboot.service;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SampleService {

    public void execSample() {
        log.info("サンプルサービス処理");
    }

    /**
     * 呼出確認
     * @param parentClassName 親クラス名
     */
    public void callConf(String parentClassName) {
        log.info("呼出確認 - 親クラス：[" + parentClassName + "]→現クラス：[" + this.getClass().getSimpleName() + "]");
    }
}
