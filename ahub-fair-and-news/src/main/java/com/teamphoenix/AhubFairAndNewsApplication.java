package com.teamphoenix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AhubFairAndNewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AhubFairAndNewsApplication.class, args);
	}

}
