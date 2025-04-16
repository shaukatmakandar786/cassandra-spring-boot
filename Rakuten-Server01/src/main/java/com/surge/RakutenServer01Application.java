package com.surge;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Rakuten Camunda REST API Documentation",
				description = "Rakuten Camunda REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Rangaswamy Doddaiah",
						email = "rangaswamy_d@surgetechinc.in",
						url = "https://surgetechinc.com"
				)
		)
)
//@EnableReactiveCassandraRepositories(basePackages = "com.surge.demo.repository")
public class RakutenServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(RakutenServer01Application.class, args);
		System.out.println("Welcome to Rakuten Server!");
	}

}
