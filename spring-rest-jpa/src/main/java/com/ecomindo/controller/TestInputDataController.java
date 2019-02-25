package com.ecomindo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomindo.model.InputData;
import com.ecomindo.repository.InputDataRepository;
import com.ecomindo.service.SpringService;

@RestController
public class TestInputDataController {
	
	@Autowired
	private SpringService springService;
	
	// Get All Data by Service
	@GetMapping("/get-input")
	public List<InputData> getAllData() {
		return springService.getAllInputData();
	}
	
	// Post Data by Service
	@PostMapping(value="/add-input", consumes= {"application/json"})
	public List<InputData> postInputData(@RequestBody InputData inputData) {
		return springService.addInputData(inputData);
	}
	
	// Get single Data by id with Service
	@GetMapping("/data")
	public InputData getData(@RequestParam Long id) {
		return springService.getInputDataByID(id);
	}
	
	// Hello World by Service
	@GetMapping(value="/hello")
	public String sayHello() {
		return springService.hello();
	}
	
	@GetMapping("/check")
	public String getStatus() {
		return "Working";
	}
	
	@GetMapping("/{id}")
	public String getUser(@PathVariable Long id) {
	 return "HTTP Get was called";
	}
	
	/*
	 * @GetMapping("/test") public Integer getTest() { return
	 * springService.kalidua(2); }
	 */
	
}
