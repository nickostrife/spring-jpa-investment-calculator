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
import com.ecomindo.model.OutputInfo;
import com.ecomindo.repository.InputDataRepository;
import com.ecomindo.repository.OutputInfoRepository;
import com.ecomindo.service.SpringService;

@RestController
public class OutputInfoController {
	
	@Autowired
	private SpringService springService;
	
	@Autowired
	private OutputInfoRepository outputInfoRepository;
	
	// Post Data and Return Response by Service
//	@PostMapping(value="/info", consumes={"application/json"})
//	public List<OutputInfo> getAllInfo() {
//		return springService.calcFormula();
//	}
	
	// Get All Data by Service
	@GetMapping("/get-output")
	public List<OutputInfo> getAllInfo() {
		return springService.getAllOutputInfo();
	}
	
	// Get Data for single id by Service using @PathVariable
	@GetMapping("/info/{oid}")
	public OutputInfo getInfoId(@PathVariable long oid) {
		Optional<OutputInfo> outputInfo = outputInfoRepository.findById(oid);
		
		return outputInfo.get();
	}
//	
	// Get Data for single id by Service using @RequestParam
	@GetMapping("/info")
	public OutputInfo getInfo(@RequestParam long oid) {
		Optional<OutputInfo> outputInfo = outputInfoRepository.findById(oid);
			
		return outputInfo.get();
	}
//	
//	@GetMapping("/checkinfo")
//	public String getStatus() {
//		return "Working";
//	}
//	
//	@GetMapping("/checkmethod")
//	public String getMethod() {
//		return springService.calcFormula();
//	}
//	
//	@GetMapping("/infoid/{id}")
//	public String getUser(@PathVariable Long id) {
//	 return "HTTP Get was called";
//	}
//	
//	
//	@PostMapping(value = "/tes")
//	public Integer kaliduax{
//			return springService.kalidua(2);
//	}
	
	// TEST METHOD
	@PostMapping(value="/calculate", consumes= {"application/json"})
	public List<OutputInfo> calculateInput(
			@RequestBody InputData inputData
			//Integer amount, Integer stockRatio, Integer cashRatio, Integer durationYear, Integer stockReturn, Integer cashReturn
			) {
		springService.addInputData(inputData);
		
		return springService.calculateInfo(
				inputData.getAmount(), inputData.getStockRatio(), inputData.getCashRatio(), inputData.getDurationYear(),
				inputData.getStockReturn(), inputData.getCashReturn()
				);
	}
	
}

	
