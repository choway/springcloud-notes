package com.choway.springcloudnotes.eurekaconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/test")
	public Object test() {
		return restTemplate.getForObject("http://EUREKA-CLIENT/", String.class);
	}

}
