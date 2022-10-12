package com.show_me_headers.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestHeader;

public interface HeaderController {

	
	void getHeaders(@RequestHeader Map<String,String> headers);
	
	
	
}
