package com.video.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {
	@Bean
	OpenAPI myConfiguration() {
		OpenAPI openAPI = new OpenAPI();
		
		Info info = new Info();
		info.setContact(new Contact());
		return openAPI;
	}

}
