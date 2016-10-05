package org.vehicaltracking.clientapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@Component
@RestController
public class Greeter {
	
	@Value("${message.greeting}")
	public String message;
	

	@RequestMapping(value="/")
	String home(){
		return message;
	}
}