package com.sachin.kafka.consumer.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sachin.kafka.consumer.kafkaconsumer.pojo.Person;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "kafka_consumer1", groupId = "group_id")
	public void consumer(String message) {
		System.out.println("Kafka Listener:" + message);
	}
	
	@KafkaListener(topics = "kafka_consumer1", groupId = "group_json",
            containerFactory = "kafkaListenerContainerFactoryJson")
    public void consumeJson(Person person) {
        System.out.println("Consumed JSON Message: " + person);
    }
}
