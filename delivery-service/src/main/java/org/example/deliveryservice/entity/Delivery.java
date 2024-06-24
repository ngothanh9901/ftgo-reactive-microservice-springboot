package org.example.deliveryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.deliveryservice.enums.DeliveryState;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {
    private Long id;
    private String pickupAddress;
    private DeliveryState state;
    private Long restaurantId;
    private Timestamp pickUpTime;
    private String deliveryAddress;
    private Timestamp deliveryTime;
    private Long assignedCourier;
    private Timestamp readyBy;
}
