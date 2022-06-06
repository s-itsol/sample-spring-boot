package net.sitsol.samplespringboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

    public void execSample() {
        System.out.println("サンプルサービス処理");
    }
}
