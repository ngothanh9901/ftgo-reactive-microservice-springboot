package org.example.kitchenservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.kitchenservice.entity.common.TicketLineItem;
import org.example.kitchenservice.enums.TicketState;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long id;
    private TicketState state;
    private TicketState previousStatus;
    private Long restaurantId;
    private List<TicketLineItem> lineItems;

    private Timestamp readyBy;
    private Timestamp acceptTime;
    private Timestamp preparingTime;
    private Timestamp pickedUpTime;
    private Timestamp readyForPickupTime;
}
