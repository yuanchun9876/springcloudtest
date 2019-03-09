package com.yuzo.springcloud.ribbon.ServiceRibbon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;



@Service
public class HelloService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="fallbackForHiService")
	public String hiService(String name) {
		
		return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
	}

	public String fallbackForHiService(String name) {
		return "hi" + name + ", sorry eureka-client is down!";
	}
}
