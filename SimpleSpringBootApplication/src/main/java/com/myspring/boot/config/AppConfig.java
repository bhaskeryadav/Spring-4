package com.myspring.boot.config;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.myspring.boot")
@SpringBootApplication
public class AppConfig {

	public static void main(String[] args) {
		
		System.out.println("Starting application.....");
		
		ApplicationContext appCtx=SpringApplication.run(AppConfig.class, args);
		
		System.out.println("Application started.");
		
		System.out.println("Following beans are craeted");
		
		String names[]=appCtx.getBeanDefinitionNames();
		
		Arrays.asList(names).forEach(e->System.out.println(e));
		
	}
}
