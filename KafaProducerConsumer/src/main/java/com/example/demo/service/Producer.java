package com.example.demo.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    public static final String topic = "TestTopic";
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishToKafka(String message) {
        kafkaTemplate.send(topic, message);
    }
}
