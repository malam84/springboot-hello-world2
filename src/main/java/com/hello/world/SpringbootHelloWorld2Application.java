package com.hello.world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootHelloWorld2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorld2Application.class, args);
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String getHello() {
		System.out.println("Hello World!");
		return "Hello World";
	}

}
