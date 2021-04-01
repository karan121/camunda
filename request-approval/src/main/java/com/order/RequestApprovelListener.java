package com.order;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

import spinjar.com.sun.istack.logging.Logger;

public class RequestApprovelListener implements ExecutionListener {
	private static final Logger logger = Logger.getLogger(RequestApprovelListener.class);
	@Override
	public void notify(DelegateExecution arg0) throws Exception {
		logger.info("RequestApprovelListener is called..");
System.out.println("*******************************************************************************");
		
		Map<String, Object> map=arg0.getVariables();
		
		System.out.println(map);
	}
}
