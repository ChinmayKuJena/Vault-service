package com.vault.vault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)

public class VaultApplication implements CommandLineRunner {
	private final MyConfiguration configuration;

	public VaultApplication(MyConfiguration configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(VaultApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		// logger.info(" example.username is {}", configuration.getUsername());
		// logger.info(" example.password is {}", configuration.getPassword());
		logger.info("   key.email is {}", configuration.getEmail());
		logger.info("----------------------------------------");
	}

}
