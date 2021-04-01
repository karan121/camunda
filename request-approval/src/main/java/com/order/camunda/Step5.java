package com.order.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class Step5 implements JavaDelegate{

	@Autowired
	private KafkaTemplate<String, String>  kafka;


	@Override
	public void execute(DelegateExecution execution) throws Exception {

		System.out.println(execution.getVariables());

		StringBuffer buffer = new StringBuffer();
		buffer.append("<GetActOrderDetails><RequestStatus>").
		append(execution.getVariable("osmStatus")).
		append("<orderId>").
		append(execution.getVariable("orderId")).
		append("</orderId>").
		append("</RequestStatus></GetActOrderDetails>");
		kafka.send("osm_error", buffer.toString());
}

}
