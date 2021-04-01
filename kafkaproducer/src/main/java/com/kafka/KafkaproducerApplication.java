package com.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KafkaproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaproducerApplication.class, args);
	}

	@Autowired
	private KafkaTemplate<String, String>  kafka;

	@PostMapping("/push")
	public String push(@RequestParam("val") String val) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<GetActOrderDetails><OrderID>");
		buffer.append(val);
		buffer.append("</OrderID></GetActOrderDetails>");
		kafka.send("osm", buffer.toString());
		return buffer.toString();
	}

}
