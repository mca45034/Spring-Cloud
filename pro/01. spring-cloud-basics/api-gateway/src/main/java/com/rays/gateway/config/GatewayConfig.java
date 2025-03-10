package com.rays.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * It defines microservice routers. It routes requests to respective
 * microservice using service name regsitered at discovery server. For example
 * service01, service02, and ORS10 are names registered with discovery server.
 * 
 */

@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route("service01", r -> r.path("/service01/**").uri("lb://service01"))
				.route("service02", r -> r.path("/service02/**").uri("lb://service02"))
				.route("spring-boot-simple", r -> r.path("/spring-boot-simple/**").uri("lb://spring-boot-simple"))
				.route("springboottest", r -> r.path("/springboottest/**").uri("lb://springboottest"))
				.build();
	}
}
