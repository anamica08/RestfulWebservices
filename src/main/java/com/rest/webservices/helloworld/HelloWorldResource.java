package com.rest.webservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/greetings")
	public String greet() {
		return "Hello World";
	}
	
	@GetMapping("/greet-bean")
	public HelloWorld greetByBean() {
		return new HelloWorld("hello by bean");
	}

//	@GetMapping("/greetings-internalization")
//	public String greetGlobal(@RequestHeader(name = "Accept-Language",required = false) Locale locale) {
//		return messageSource.getMessage("good.morning.message",null, locale);
//	}
//	
	
	@GetMapping("/greetings-internalization")
	public String greetGlobal() {
		return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
	}
	
	

}
