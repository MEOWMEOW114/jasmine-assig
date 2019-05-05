package com.jasmine.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class JasmineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasmineApplication.class, args);
	}

}
//
//@RestController
//class GreetingController{
//	
//    private static final String template = "Hello, %s!";
//
//  @GetMapping("/")
//  @ResponseBody
//  Greet greet(){
//    return new Greet(11,
//            String.format(template, "adsfasdf"));
//  }
//}

