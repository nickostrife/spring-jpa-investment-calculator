package com.ecomindo.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InputFormRepository extends CrudRepository<InputForm, Long> {
	
	List<InputForm> findByLastName(String lastName);
}
