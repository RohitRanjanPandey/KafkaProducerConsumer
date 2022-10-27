package com.example.demo.controller;

import com.example.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    Producer producer;

    @PostMapping("/kafkaapp")
    public void publishMessage(@RequestParam("message") String message) {
        System.out.println("Published message : "+ message);
        producer.publishToKafka(message);
    }
}
