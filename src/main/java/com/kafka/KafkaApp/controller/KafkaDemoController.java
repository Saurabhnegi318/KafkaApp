package com.kafka.KafkaApp.controller;

import com.kafka.KafkaApp.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Kafka")
public class KafkaDemoController {

    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("/produce")
    public void getMessage(@RequestParam("message") String message) {

        System.out.println("Inside getMessage method");
        kafkaProducer.sendMsgToTopic(message);

    }


}
