package com.spring.saggezza.technicalclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringSaggezzaTechnicalclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSaggezzaTechnicalclassApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
