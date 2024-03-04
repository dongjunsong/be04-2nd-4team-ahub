package com.teamphoenix.ahub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AhubMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(AhubMemberApplication.class, args);
	}

}
