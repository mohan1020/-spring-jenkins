package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

  private static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
  
    @PostConstruct
    public void init() {
    	logger.info("Application started sccussfully...");
    }
	public static void main(String[] args) {
		
		logger.info("Application excuted.....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
