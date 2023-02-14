package com.kafka.KafkaApp.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka_test_topic",groupId = "kafka_group_01")
    public void listenFromTopic(String message)
    {
        System.out.println("++++++++++++++++++++++++++++++" + message + "++++++++++++++++++++++++++++++");
    }
}

