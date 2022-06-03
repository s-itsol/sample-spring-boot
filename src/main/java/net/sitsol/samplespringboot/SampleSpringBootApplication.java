package net.sitsol.samplespringboot;

import lombok.extern.slf4j.Slf4j;
import net.sitsol.samplespringboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Slf4j
@Profile("!test")
public class SampleSpringBootApplication implements CommandLineRunner {

	@Autowired
	SampleService sampleService;

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

	@Override
	public void run(String ... args) {

		log.info("spring-bootコマンド処理本体-開始");

		// サンプルサービス実行
		sampleService.execSample();

		log.info("spring-bootコマンド処理本体-終了");
	}

}
