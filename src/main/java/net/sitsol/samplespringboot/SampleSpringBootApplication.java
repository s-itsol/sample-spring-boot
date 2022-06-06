package net.sitsol.samplespringboot;

import lombok.extern.slf4j.Slf4j;
import net.sitsol.samplespringboot.service.SampleService;
import org.slf4j.MDC;
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

	public static final String MDC_KEY_USER_ID = "userId";

	public static void main(String[] args) {
		try {
			// ログ用MDCキー値の設定
			MDC.put(MDC_KEY_USER_ID, SampleSpringBootApplication.class.getSimpleName());

			// spring-bootアプリケーション実行
			SpringApplication.run(SampleSpringBootApplication.class, args);

		} finally {
			// ログ用MDCキー値の除去
			MDC.remove(MDC_KEY_USER_ID);
		}
	}

	@Override
	public void run(String ... args) {

		log.info("spring-bootコマンド処理本体-開始");

		// サンプルサービス実行
		sampleService.execSample();

		log.info("spring-bootコマンド処理本体-終了");

	}

}
