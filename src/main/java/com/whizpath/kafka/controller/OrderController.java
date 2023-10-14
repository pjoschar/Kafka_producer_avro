package com.whizpath.kafka.controller;

import com.whizpath.kafka.model.Order;
import com.whizpath.kafka.publisher.KafkaPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class OrderController {
    private final KafkaPublisher kafkaPublisher;

    @PostMapping("/order/create")
    public ResponseEntity<String> createOrder(@RequestBody Order order){
        try{
            kafkaPublisher.produceKafkaMessage("order",order);
            return new ResponseEntity<String>("Message Successfully sent to kafka topic", HttpStatus.ACCEPTED);
        }catch (Exception exception){
            log.error("Error sending message to kafka topic, exception = {}",exception.getMessage());
            return new ResponseEntity<String>("Error sending message to kafka topic", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
