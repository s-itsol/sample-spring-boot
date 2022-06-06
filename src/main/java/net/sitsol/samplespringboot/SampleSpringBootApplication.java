package net.sitsol.samplespringboot;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import net.sitsol.samplespringboot.service.SampleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@RequiredArgsConstructor
@Profile("!test")
public class SampleSpringBootApplication implements CommandLineRunner {

	@NonNull
	private final SampleService sampleService;

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
