package com.rest.webservices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;



@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact(
			"Anamika", null,"anamikaa428@gmail.com");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			"Awesome API Title", "Awesome API Description", "1.0",
			"urn:tos", DEFAULT_CONTACT, 
			"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Arrays.asList());

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
			new HashSet<String>(Arrays.asList("application/json",
					"application/xml"));
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
	//create bean - docket
	//all the paths
	//all the apis

}


/*
 * Quick Update:



 used this dependency and removed the three swagger spring fox dependencies

<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-boot-starter</artifactId>
  <version>3.0.0-SNAPSHOT</version>
</dependency>


deleted the spring fox swagger dependencies by deleting io folder in my maven repository(/Users/rangakaranam/.m2/repository/io)



And this URL works: http://localhost:8080/swagger-ui/index.html
 * */
