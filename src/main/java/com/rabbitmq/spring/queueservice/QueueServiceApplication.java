package com.rabbitmq.spring.queueservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QueueServiceApplication {
	private static final Logger logger = LoggerFactory.getLogger (QueueServiceApplication.class);

	public static void main(String[] args) {
		logger.info ("Inicindo API");
		SpringApplication.run(QueueServiceApplication.class, args);
		logger.info ("API iniciada");
	}

}
