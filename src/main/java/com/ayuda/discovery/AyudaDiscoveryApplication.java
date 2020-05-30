package com.ayuda.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AyudaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AyudaDiscoveryApplication.class, args);
	}

}
