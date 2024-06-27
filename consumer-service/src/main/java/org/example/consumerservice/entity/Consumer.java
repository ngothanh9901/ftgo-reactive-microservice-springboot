package org.example.consumerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {
    private Long id;
    private String identity;
    private String firstName;
    private String lastName;
}
