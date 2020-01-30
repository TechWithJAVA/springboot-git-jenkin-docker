package com.java.spring.jenkin.docker.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootJenkinDockerIntegrationTestApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinDockerIntegrationTestApplication.class);

	public void init() {
		logger.info("Application Started......");
		
	}
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to TechWithJava";
	}

	public static void main(String[] args) {
		logger.info("Application executed......");
		SpringApplication.run(SpringBootJenkinDockerIntegrationTestApplication.class, args);
	}

}
