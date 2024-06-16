package com.system.sec.kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "security-system", groupId = "security-system-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}

