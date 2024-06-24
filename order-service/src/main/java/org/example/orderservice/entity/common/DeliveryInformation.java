package org.example.orderservice.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryInformation {
    private Timestamp deliveryTime;
    private String deliveryAddress;
}
