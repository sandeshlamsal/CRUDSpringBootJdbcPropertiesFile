package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com")  //to scan for url out of folder
public class CrudMySqlJdbcTemplateSpringMvcRestApplication {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=ewNiEfbcEhg
		SpringApplication.run(CrudMySqlJdbcTemplateSpringMvcRestApplication.class, args);
	}
}
