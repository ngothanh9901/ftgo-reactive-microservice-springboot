package org.example.consumerservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String identity;
    private String email;
}
