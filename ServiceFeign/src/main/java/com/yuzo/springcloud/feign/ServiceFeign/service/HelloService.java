package com.yuzo.springcloud.feign.ServiceFeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuzo.springcloud.feign.ServiceFeign.service.impl.HelloServiceImpl;

@FeignClient(value="eureka-client", fallback=HelloServiceImpl.class)
public interface HelloService {

	@RequestMapping("/hi")
	String hiService(@RequestParam("name") String name);
}
