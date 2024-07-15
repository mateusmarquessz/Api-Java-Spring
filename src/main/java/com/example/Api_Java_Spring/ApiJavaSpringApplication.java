package com.example.Api_Java_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJavaSpringApplication.class, args);
	}

}
