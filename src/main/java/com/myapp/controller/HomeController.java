package com.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.config.ApplicationProperties;

@RestController
@RequestMapping("/api")
public class HomeController {

	private Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	ApplicationProperties prop;
	
	@GetMapping("/home")
	public ResponseEntity<Object> home(){
		
		log.info("App properties:"+ prop.getUrl());
		log.info("App properties:"+ prop.getUserName());
		log.info("App properties:"+ prop.getPassword());
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/{user}", method=RequestMethod.GET)
	public String getUser(@PathVariable Long user) {

		return "Syed Ibrez";
	}
	
	@RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
	public String getUserCustomers(@PathVariable Long user) {

		return "Customers";
	}
}
