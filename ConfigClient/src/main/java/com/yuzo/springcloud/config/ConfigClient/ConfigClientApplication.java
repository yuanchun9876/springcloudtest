package com.yuzo.springcloud.config.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class ConfigClientApplication {
	
	@Value("${jdbc.username}")
	private String userName;
	
	@RequestMapping("/hi")
	public String hi() {
		return "this username is " + userName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
