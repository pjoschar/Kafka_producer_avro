package com.whizpath.kafka.model;

import lombok.Data;

@Data
public class OrderItem {
    private String itemName;
    private double itemPrice;
}
