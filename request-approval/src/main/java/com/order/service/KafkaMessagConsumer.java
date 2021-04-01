package com.order.service;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.order.GetActOrderDetails;

@Service
public class KafkaMessagConsumer {
	
	@Autowired
	private ProcessEngine processEngine;
	
	@Autowired
    DataSource dataSource;
	
	
	private static final Logger logger = Logger.getLogger(KafkaMessagConsumer.class);
	
	@KafkaListener(topics = "osm", groupId = "group_id")
	public void consumeXml(String message) throws IOException
	{
		
		logger.info("message consume from kafka topic osm " + message);

		JAXBContext jaxbContext;
		try {
			
			  jaxbContext = JAXBContext.newInstance(GetActOrderDetails.class);
			  
			  Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			  
			  GetActOrderDetails kafkaMessage = (GetActOrderDetails)
			  jaxbUnmarshaller.unmarshal(new StringReader(message));
			  
			  logger.info("kafkaMessage:" + kafkaMessage);

			//System.out.println(camundaRepository.findByOrderId(message));

			  Map<String, Object> variables = new HashMap<String, Object>();
			  variables.put("request", kafkaMessage);
			  variables.put("message", message);
			  ProcessInstance processInstance =
			  processEngine.getRuntimeService().startProcessInstanceByKey(
			  "activate_request", variables);
			 
		} catch (Exception e) {
			logger.error("Errro in KafkaMessagConsumer:{}", e);
		}
	}

}
