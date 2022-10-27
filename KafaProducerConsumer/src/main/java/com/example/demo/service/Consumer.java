package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "TestTopic", groupId = "TestGroup")
    public void consumeMessage(String message) {
        System.out.println("Received msg :" + message);
    }
}
