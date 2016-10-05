package org.vehicaltracking.clientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	
@EnableAutoConfiguration
@SpringBootApplication
public class HelloWorld {

	public static void main(String []s ) throws Exception {
		SpringApplication.run(HelloWorld.class, s);
	}
}
