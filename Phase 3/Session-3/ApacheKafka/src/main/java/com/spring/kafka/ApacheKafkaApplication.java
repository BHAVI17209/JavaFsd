package com.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ApacheKafkaApplication {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaApplication.class, args);
	}
	
	@KafkaListener(topics = "ecommerce",groupId = "group-id")
	public void listen(String message)
	{
		System.out.println("Receive the message "+message);
	}

}
