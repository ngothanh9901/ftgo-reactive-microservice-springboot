package org.example.deliveryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.deliveryservice.entity.common.Plan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Courier {
    private Long id;
    private Plan plan;
    private Boolean available;
}
