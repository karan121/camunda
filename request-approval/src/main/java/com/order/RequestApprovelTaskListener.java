package com.order;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

import spinjar.com.sun.istack.logging.Logger;

public class RequestApprovelTaskListener implements TaskListener {
	
	private static final Logger logger=Logger.getLogger(RequestApprovelTaskListener.class);

	@Override
	public void notify(DelegateTask arg0) {
		logger.info("RequestApprovelTaskListener is called...");
		
	}

	

}
