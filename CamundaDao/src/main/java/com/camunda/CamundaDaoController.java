package com.camunda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.camunda.model.OSMDetails;
import com.camunda.repo.OSMRepository;

@RestController
public class CamundaDaoController {

	@Autowired
	private OSMRepository repo;
	
	@GetMapping("/osmstatus")
	public String fetchOsmStatus(@RequestParam("orderId") String orderId) {
		
		List<OSMDetails> osmData = repo.findByOrderId(orderId);
		
		System.out.println(osmData.get(0).getStatus());
		return osmData.get(0).getStatus();
	}
	
	
}
