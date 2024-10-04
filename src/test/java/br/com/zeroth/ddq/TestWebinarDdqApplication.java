package br.com.zeroth.ddq;

import org.springframework.boot.SpringApplication;

public class TestWebinarDdqApplication {

	public static void main(String[] args) {
		SpringApplication.from(WebinarDdqApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
