package org.example.deliveryservice.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.deliveryservice.enums.DeliveryActionType;
import org.example.deliveryservice.enums.DeliveryState;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Action {
    private DeliveryActionType type;
    private String address;
    private Timestamp time;
    private Long deliveryId;
}
