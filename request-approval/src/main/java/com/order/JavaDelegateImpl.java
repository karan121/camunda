package com.order;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import spinjar.com.sun.istack.logging.Logger;

public class JavaDelegateImpl  implements JavaDelegate{
	private static final Logger logger = Logger.getLogger(RequestApprovelListener.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("*******************************************************************************");
		
		Map<String, Object> map=execution.getVariables();
		
		System.out.println(map);
		
		
	}

}
