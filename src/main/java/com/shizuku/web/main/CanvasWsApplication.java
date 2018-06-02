package com.shizuku.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shizuku.web")
public class CanvasWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanvasWsApplication.class, args);
	}
}
