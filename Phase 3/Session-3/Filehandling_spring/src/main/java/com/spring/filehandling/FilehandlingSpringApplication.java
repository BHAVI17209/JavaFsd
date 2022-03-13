package com.spring.filehandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.filehandling.controller")
public class FilehandlingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilehandlingSpringApplication.class, args);
	}

}
