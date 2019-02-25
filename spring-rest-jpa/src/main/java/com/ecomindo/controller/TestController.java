package com.ecomindo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomindo.model.TestModel;
import com.ecomindo.service.SpringService;

@RestController
public class TestController {
		
		TestModel test;
		
		@Autowired
		SpringService springService;
		
//		@PostMapping(value="/test-a", consumes= {"application/json"})
//		public Integer postTest(@RequestBody TestModel test) {
//			return springService.timesTwo();
//		}
		
		@PostMapping(value= "/test-b",consumes = {"application/json"})
	    public TestModel post(@RequestBody TestModel test) {
			return test;
	    }
}
