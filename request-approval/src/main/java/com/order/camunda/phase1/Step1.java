package com.order.camunda.phase1;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Step1 implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String id = (String) execution.getVariable("id");
		
		execution.setVariable("response", "response is "+id);
		
	}

}
