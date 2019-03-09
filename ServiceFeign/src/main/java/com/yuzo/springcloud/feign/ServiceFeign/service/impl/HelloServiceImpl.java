package com.yuzo.springcloud.feign.ServiceFeign.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.yuzo.springcloud.feign.ServiceFeign.service.HelloService;



@Service
public class HelloServiceImpl implements HelloService{

	public String hiService(String name) {
		
		return "hi" + name + ", sorry eureka-client is down!";
	}


}
