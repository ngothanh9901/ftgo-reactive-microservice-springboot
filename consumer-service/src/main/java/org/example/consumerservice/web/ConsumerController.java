package org.example.consumerservice.web;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import org.example.consumerservice.service.ConsumerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    private ConsumerService consumerService;
    @PostMapping
    Mono<Consumer> create(@RequestBody Mono<CreateConsumerDto> createConsumerDto){
        return consumerService.create(createConsumerDto);
    }
}
