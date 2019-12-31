package com.marcusdacoregio.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //This annotation tells Spring to activate the Eureka Server related configuration.
public class RegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}

}
/*
 * Now we will build the registry service using the Netflix Eureka. This service
 * is responsible for the registration and discovery of the many services we
 * should build. This way we don’t need to know the IP address of each service
 * we create, we just know their names and the discovery do the rest.
 */