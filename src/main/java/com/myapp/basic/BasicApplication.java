package com.myapp.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.myapp"})
public class BasicApplication {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(BasicApplication.class);
		System.out.println("=========================");
		SpringApplication app = new SpringApplication(BasicApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
