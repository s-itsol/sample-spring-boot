package net.sitsol.samplespringboot;

import net.sitsol.samplespringboot.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Profile("!test")
public class SampleSpringBootApplication implements CommandLineRunner {

	@Autowired
	SampleService sampleService;

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

	@Override
	public void run(String ... args) {

		System.out.println("spring-bootコマンド処理本体-開始");

		// サンプルサービス実行
		sampleService.execSample();

		System.out.println("spring-bootコマンド処理本体-終了");
	}

}
