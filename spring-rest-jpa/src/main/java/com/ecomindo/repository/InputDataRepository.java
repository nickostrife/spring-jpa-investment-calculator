package com.ecomindo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ecomindo.model.InputData;

public interface InputDataRepository extends JpaRepository<InputData, Long> {

	//List<InputData> findAll(Long id, int amount, int durationYear);
}
