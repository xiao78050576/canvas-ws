package com.shizuku.web.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shizuku.web")
@MapperScan("com.shizuku.web.mapper")
public class CanvasWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanvasWsApplication.class, args);
	}
}
