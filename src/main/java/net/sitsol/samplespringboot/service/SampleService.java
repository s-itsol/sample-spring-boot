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
}
