package com.test.springCloudConfigClient.springCloudConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {
	
	 @Value("${name.value}")
	private String getValue;
	
	@GetMapping("/hello")
	public String getHello() {
	  return getValue;	
	}

}
