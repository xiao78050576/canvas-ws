package com.shizuku.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .groupName("shizuku")
          .apiInfo(apiInfo())
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.shizuku.web.controller"))    
          .paths(PathSelectors.any())                          
          .build();                                           
    }
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
	        .title("canvas-ws API文档")
	        .description("接口文档")
	        .termsOfServiceUrl("https://github.com/xiao78050576/canvas-ws")
	        .version("1.0.0").build();
    }
}
