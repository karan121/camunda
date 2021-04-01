package com.order.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import com.order.GetActOrderDetails;

public class Step1 implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println(execution.getVariables());
		
		if(execution.getVariable("request")!=null) {
			GetActOrderDetails actOrderDetails = (GetActOrderDetails) execution.getVariable("request");
			execution.setVariable("orderId", actOrderDetails.OrderID);
			execution.setVariable("orderIdPresent", true);
		}
		
		
		
	}

}
