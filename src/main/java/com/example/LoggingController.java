package com.example;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping(value= {"","/"})
	public ResponseEntity<?> initial() {
		logger.info("đây là info");
		logger.debug("đây là debug");
		logger.trace("đây là trace");
		logger.error("đây là error");
		return ResponseEntity.ok().body("logging test");
		
	}
}
