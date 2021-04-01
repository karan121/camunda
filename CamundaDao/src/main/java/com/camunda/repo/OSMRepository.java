package com.camunda.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.camunda.model.OSMDetails;

public interface OSMRepository extends CrudRepository<OSMDetails, Long>{
	
	List<OSMDetails> findByOrderId(String orderId);

}
