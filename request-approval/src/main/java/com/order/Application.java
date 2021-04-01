package com.order;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableProcessApplication
@EnableScheduling
public class Application extends SpringBootServletInitializer{

	@Autowired
	private ProcessEngine processEngine;

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	/*
	 * @EventListener private void processPostDeploy(PostDeployEvent event) {
	 * processEngine.getRuntimeService().
	 * activateProcessInstanceByProcessDefinitionKey("activate_request");
	 * 
	 * //processEngine.getRuntimeService().startProcessInstanceByKey("processes");
	 * 
	 * }
	 */
}