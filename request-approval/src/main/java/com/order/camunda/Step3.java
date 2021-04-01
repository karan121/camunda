package com.order.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Step3 implements JavaDelegate{

	@Value("${camunda.dao.endpoint}")
	private String daoEndpoint;
	
	@Value("${camunda.dao.operation}")
	private String operation;
	
	@Value("${camunda.dao.param}")
	private String param;
	

	@Autowired
	RestTemplate restTemplate;

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		System.out.println("data base call");

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response =  restTemplate.getForEntity(daoEndpoint+operation+"?"+param+"="+(String)execution.getVariable("orderId"), String.class);
		
		System.out.println(response.getBody());
		execution.setVariable("osmStatus", response.getBody());
		
		if("success".equalsIgnoreCase(response.getBody())) {
			execution.setVariable("status", true);
		}else {
			execution.setVariable("status", false);
		}
		
	}

}
