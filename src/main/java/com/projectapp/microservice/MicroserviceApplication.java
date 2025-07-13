package com.projectapp.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}

}
@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public String greet() {
        return "Hello from ABC Technologies!";
    }
}

