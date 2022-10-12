package com.show_me_headers.controller.implementation;

import java.util.Map;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.show_me_headers.controller.HeadersController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:8090"})
public class HeadersControllerImpl implements HeadersController {
	
	
	@Override
	@GetMapping("/getAll")
	public void showHeaders(@RequestHeader Map<String, String> headers) {		
		headers.entrySet().stream().forEach(System.out::println);
	}

}
