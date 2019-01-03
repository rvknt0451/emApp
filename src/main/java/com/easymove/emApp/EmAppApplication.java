package com.easymove.emApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.easymove.emApp.controller.Controller;

@SpringBootApplication
public class EmAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmAppApplication.class, args);
	}

}

