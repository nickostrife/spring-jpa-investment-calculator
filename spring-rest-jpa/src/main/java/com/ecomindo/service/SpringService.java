package com.ecomindo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.json.simple.JSONObject;

import com.ecomindo.model.InputData;
import com.ecomindo.model.OutputInfo;
import com.ecomindo.model.TestModel;
import com.ecomindo.repository.InputDataRepository;
import com.ecomindo.repository.OutputInfoRepository;

@Service
public class SpringService {
	
	@Autowired
	private InputDataRepository inputRepository;
	
	@Autowired
	private OutputInfoRepository outputRepository;
	
	// Create New Object inputData
	private InputData inputData = new InputData();
	private OutputInfo outputInfo = new OutputInfo();
	private TestModel testModel = new TestModel();
	
	// Function for Investment Calculation list
	public List<OutputInfo> calculateInfo(
			Integer amount, Integer stockRatio, Integer cashRatio, Integer durationYear, Integer stockReturn, Integer cashReturn
			) {
		List<OutputInfo> listOutputInfo = new ArrayList<>();
		
		Integer month;
		Integer begStock;
		Integer begCash;
		Integer begTot;
		Integer traStock;
		Integer traCash;
		Integer traTot;
		Integer rebStock;
		Integer rebCash;
		Integer endStock;
		Integer endCash;
		Integer endTot;
		
		for(int i=0; i < (durationYear*2); i++) {
					
			OutputInfo newOutputInfo = new OutputInfo();
			InputData newInputData = new InputData();
			
			month 	= (i * 6) + 6;
			begStock= amount * stockRatio / 100;
			begCash = amount * cashRatio / 100;
			begTot 	= begStock + begCash;
			traStock= (int) (begStock + (begStock * InputData.getRandomNumberInts(-stockReturn, stockReturn) / 100));
			traCash = begCash + (begCash * cashReturn / 100);
			traTot 	= traStock + traCash;
			rebStock= (traTot / 2) - traStock;
			rebCash = (traTot / 2) - traCash;
			endStock= traTot / 2;
			endCash = endStock;
			endTot 	= endStock + endCash;
			
			amount 	= endTot;
			
			newInputData.setAmount(amount);
			
			newOutputInfo.setMonth(month);
			newOutputInfo.setBegStock(begStock);
			newOutputInfo.setBegCash(begCash);
			newOutputInfo.setBegTot(begTot);
			newOutputInfo.setTraStock(traStock);
			newOutputInfo.setTraCash(traCash);
			newOutputInfo.setTraTot(traTot);
			newOutputInfo.setRebCash(rebCash);
			newOutputInfo.setRebStock(rebStock);
			newOutputInfo.setEndCash(endCash);
			newOutputInfo.setEndStock(endStock);
			newOutputInfo.setEndTot(endTot);
			
			listOutputInfo.add(outputRepository.save(newOutputInfo));
		}
		
		return listOutputInfo;
		//return "API/STATUS: 200(OK). All data has been added to the database.";
	}
	
	// Function to call list Input Data by ID
	public InputData getInputDataByID(Long id) {
		InputData inputData = new InputData();
		inputData = (inputRepository.findById(id).get());
			
		return inputData;
	}	
	
	// Function to add new Input Data to the database
	public List<InputData> addInputData(InputData inputData) {
		List<InputData> inputDataList = new ArrayList<>();
		inputDataList.add(inputRepository.save(inputData));
		
		return inputDataList;
	}
	
	/*	Tes Pak Mamad
	 * 
	 * public Integer kalidua(int a) { Integer b = a*2; return b; }
	 * 
	 * public Integer timesTwo() { return testModel.getA(); }
	 */
	
	// Function to call all list Input Data from db
	public List<InputData> getAllInputData() {
		List<InputData> inputDataList = new ArrayList<>();
		inputDataList = inputRepository.findAll();
		
		return inputDataList;
	}
	
	// Function to call all list Output Info from db
		public List<OutputInfo> getAllOutputInfo() {
			List<OutputInfo> outputInfoList = new ArrayList<>();
			outputInfoList = outputRepository.findAll();
			
			return outputInfoList;
		}
	
	// Function to call Hello World
	public String hello() {
		return "Hello World";
	}
	
}
