package net.sitsol.samplespringboot.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public void execSample() {
        System.out.println("サンプルサービス処理");
    }
}
