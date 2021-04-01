package com.order.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.history.HistoricVariableInstance;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmsController {
	
	
	@Autowired
	private ProcessEngine processEngine;

	@RequestMapping(method = RequestMethod.GET,value = "get")
	public String check(@RequestParam("id") String id) {
		
		Map<String, Object> variables = new HashMap<String, Object>();
		  variables.put("id", id);
		  ProcessInstance processInstance =
		  processEngine.getRuntimeService().startProcessInstanceByKey(
		  "activate_request", variables);
		  
		  System.out.println(processInstance.getProcessInstanceId());
		  String executionId = processEngine.getHistoryService().createHistoricDetailQuery().processInstanceId(processInstance.getProcessInstanceId()).list().get(0).getExecutionId();
	      System.out.println("executionId " + executionId);
	      
	      List<HistoricVariableInstance> hvis = processEngine.getHistoryService().createHistoricVariableInstanceQuery().executionIdIn(executionId).list();
	      System.out.println("------------ " + hvis.size());

	      for (HistoricVariableInstance hi : hvis) {
	          System.out.println(hi.getName() + " : "+ hi.getValue());
	      }
		  
		  return "ok";
	}
	
}
