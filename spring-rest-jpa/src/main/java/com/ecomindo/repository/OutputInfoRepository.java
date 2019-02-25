package com.ecomindo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ecomindo.model.OutputInfo;

public interface OutputInfoRepository extends JpaRepository<OutputInfo, Long> {

	//List<InputData> findAll(Long id, int amount, int durationYear);
}
