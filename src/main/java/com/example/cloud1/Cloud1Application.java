package com.example.cloud1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Cloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cloud1Application.class, args);
	}

}
