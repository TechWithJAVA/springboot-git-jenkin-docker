package com.java.spring.jenkin.docker.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootJenkinDockerIntegrationTestApplicationTests {

	Logger logger=LoggerFactory.getLogger(SpringBootJenkinDockerIntegrationTestApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing sucsessfully......");
		assertEquals(true, true);
	}

}
