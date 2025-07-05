package com.example.springboot_rest_demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRestDemoApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringbootRestDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Context loads test executed successfully.");
	}

}
