package com.whizpath.kafka.model;

public enum OrderStatus {
    PENDING,
    UNSHIPPED,
    PARTIALLY_SHIPPED,
    SHIPPED,
    CANCELLED,
    PENDING_AVAILABILITY;
}
