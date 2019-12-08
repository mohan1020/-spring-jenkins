package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinsApplicationTests {

	private static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@Test
	void contextLoads() {
		logger.info("test case is excuted");
		assertThat(true);
	}

}
