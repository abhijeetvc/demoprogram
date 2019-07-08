package com.firstdemo.demoprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoprogramApplication {

	public static void main(String[] args) {

		System.out.println("hello spring");
		SpringApplication.run(DemoprogramApplication.class, args);
	}

}
