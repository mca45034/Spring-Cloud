package com.rays.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * API Gateway is routing service that defines routes to cloud micro services. 
 * It is single point of contact for all the rest clients for different micro-services. 
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiGatewayApplication.class, args);

	}

//	@Bean
//	public CorsWebFilter corsWebFilter() {
//		CorsConfiguration corsConfig = new CorsConfiguration();
//		corsConfig.setAllowCredentials(true);
//
//		// Explicitly list allowed origins
//		corsConfig.addAllowedOrigin("http://localhost:4200");
//
//		// Specify allowed headers and methods
//		corsConfig.addAllowedHeader("*");
//		corsConfig.addAllowedMethod("*");
//
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", corsConfig);
//
//		return new CorsWebFilter(source);
//	}

	

}
