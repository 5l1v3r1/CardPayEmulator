package ru.yamoney.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.yamoney.test.config.JpaConfig;
import ru.yamoney.test.services.card_pay.ClearingServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(
				new Class<?>[] {Application.class, JpaConfig.class}, args);
	}
}
