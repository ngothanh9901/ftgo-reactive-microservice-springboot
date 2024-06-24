package org.example.kitchenservice.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketLineItem {
    private Integer quantity;
    private String menuItemCode;
    private String name;
}
