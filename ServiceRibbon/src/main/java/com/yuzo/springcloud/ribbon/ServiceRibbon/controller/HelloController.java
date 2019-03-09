package com.yuzo.springcloud.ribbon.ServiceRibbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuzo.springcloud.ribbon.ServiceRibbon.service.impl.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService service;
	
	@RequestMapping("/hi")
	public String hi(@RequestParam(defaultValue="turing") String name) {
		return service.hiService(name);
	}

}
