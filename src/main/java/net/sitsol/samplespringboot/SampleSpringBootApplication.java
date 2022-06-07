package net.sitsol.samplespringboot;

import lombok.extern.slf4j.Slf4j;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import net.sitsol.samplespringboot.service.QiitaService;
import net.sitsol.samplespringboot.service.SampleService;
import org.slf4j.MDC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

/**
 * サンプルspringーbootアプリケーション
 */
@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
@Profile("!test")
public class SampleSpringBootApplication implements CommandLineRunner {

	@NonNull
	private final SampleService sampleService;

	@NonNull
	private final QiitaService qiitaService;

	public static final String MDC_KEY_USER_ID = "userId";

	/**
	 * メインエントリポイント
	 * @param args メインメソッド引数文字列群
	 */
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

	/**
	 * 実行コールバック処理
	 * @param args メインメソッド引数文字列群
	 */
	@Override
	public void run(String ... args) {

		log.info("spring-bootコマンド処理本体-開始");

		// サンプルサービス実行
		sampleService.execSample();

		// 呼出確認
		qiitaService.callSample();

		qiitaService.getQiitaApiSchema();

		log.info("spring-bootコマンド処理本体-終了");

	}

}
