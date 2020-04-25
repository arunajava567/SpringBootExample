package com.cg.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello welcome to SpringBoot";
	}
    public static void main( String[] args )
    {
       SpringApplication.run(App.class,args);
    }
}
