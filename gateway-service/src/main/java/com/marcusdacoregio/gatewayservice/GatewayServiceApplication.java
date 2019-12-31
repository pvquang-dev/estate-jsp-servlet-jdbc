package com.marcusdacoregio.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient //tells Spring to enable the discovery client implementation.
@EnableZuulProxy //sets up a Zuul Server so it can forward requests to other services. 
				//This services can be configured manually through configuration or via Discovery (Eureka) Server.
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
