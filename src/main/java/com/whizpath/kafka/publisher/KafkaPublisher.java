package com.whizpath.kafka.publisher;

import com.whizpath.kafka.generated.OrderItem;
import com.whizpath.kafka.generated.OrderStatus;
import com.whizpath.kafka.generated.OrderType;
import com.whizpath.kafka.generated.OrderValue;
import com.whizpath.kafka.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaPublisher {
    private final KafkaTemplate<String, GenericRecord> kafkaTemplate;

    public void produceKafkaMessage(String topicName, Order order){
        OrderValue orderValue=new OrderValue();
        orderValue.setOrderID(order.getId());
        orderValue.setOrderDate(order.getOrderDate());
        orderValue.setOrderStatus(OrderStatus.valueOf(order.getOrderStatus().name()));
        orderValue.setTotalCost(order.getTotalCost());
        orderValue.setOrderType(OrderType.valueOf(order.getOrderType().name()));
        orderValue.setOrderItems(mapOrderItems(order.getOrderItem()));
        CompletableFuture<SendResult<String,GenericRecord>> futureResult= kafkaTemplate.send(topicName,order.getId(), orderValue);

        futureResult.whenComplete((result,ex)->{
            if(ex == null){
                log.info("message send successfully to Kafka topic - {}, partition - {} offset- {}",
                        result.getRecordMetadata().topic(), result.getRecordMetadata().partition(), result.getRecordMetadata().offset());
            }else{
                log.error("Error sending message to the topic -{}, e- {}",topicName,ex);
            }
        });
    }


    private List<OrderItem> mapOrderItems(List<com.whizpath.kafka.model.OrderItem> orderItem){
        return orderItem.stream().map((value)-> new OrderItem(value.getItemName(), value.getItemPrice())).collect(Collectors.toList());
    }
}

