package com.kush.kafka.kushKafkaProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {

    private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic.foo}")
    private String topic;

    public void send(String message){
        LOG.info("---------------------------------Sending message='{}' to topic='{}'-------------------------------------", message, topic);
        System.out.println("---------------------------------Sending message="  + message + " to topic= " + topic + "-----------------------------------");
        kafkaTemplate.send(topic, message);
    }
}