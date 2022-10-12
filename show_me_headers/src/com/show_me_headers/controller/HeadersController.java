package com.show_me_headers.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestHeader;

public interface HeadersController {
	
	
	void showHeaders(@RequestHeader Map<String, String> headers);
	

}
