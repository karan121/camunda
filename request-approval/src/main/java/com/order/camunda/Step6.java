package com.order.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Step6 implements JavaDelegate{

	@Autowired
	private KafkaTemplate<String, String>  kafka;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("step 6 ==> "+execution.getVariables());

		StringBuffer buffer = new StringBuffer();
		buffer.append("<GetActOrderDetails><RequestStatus>").
		append(execution.getVariable("osmStatus")).
		append("<orderId>").
		append(execution.getVariable("orderId")).
		append("</orderId>").
		append("</RequestStatus></GetActOrderDetails>");
		kafka.send("osm_success", buffer.toString());

		
	}

}
