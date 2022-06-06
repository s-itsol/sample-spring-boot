package net.sitsol.samplespringboot.service;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * サンプルサービス
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SampleService {

    /**
     * サンプルサービス処理実行
     */
    public void execSample() {
        log.info("サンプルサービス処理");
    }
}
