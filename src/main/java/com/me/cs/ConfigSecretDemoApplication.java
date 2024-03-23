package com.me.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:/config/application.properties")
public class ConfigSecretDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSecretDemoApplication.class, args);
	}
}
