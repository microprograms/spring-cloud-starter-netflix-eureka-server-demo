package com.github.microprograms.spring_cloud_starter_netflix_eureka_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudStarterNetflixEurekaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStarterNetflixEurekaServerDemoApplication.class, args);
	}

}
