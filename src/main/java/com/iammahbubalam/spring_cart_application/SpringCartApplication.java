package com.iammahbubalam.spring_cart_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCartApplication.class, args);

		System.out.println("Hello Spring Boot");
		sayHello();
	}

	private static void sayHello() {
		System.out.println("Hello");
	}

}
