package com.show_me_headers.controller.implementation;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.show_me_headers.controller.HeaderController;

@RestController
public class HeaderControllerImpl implements HeaderController{

	@Override
	@GetMapping("/getAll")
	public void getHeaders(Map<String, String> headers) {
		headers.entrySet().stream().forEach(System.out::println);
		
	}

}
