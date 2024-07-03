package org.example.consumerservice.web;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import org.example.consumerservice.service.ConsumerService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    private final ConsumerService consumerService;
    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }
    @PostMapping
    Mono<Consumer> create(@RequestBody CreateConsumerDto createConsumerDto){
        return consumerService.create(createConsumerDto);
    }
    @GetMapping("/{id}")
    Mono<Consumer> getConsumerById(@PathVariable("id") Long id){
        return consumerService.getConsumerById(id);
    }
    @PutMapping("/{id}")
    Mono<Consumer> updateConsumerById(@PathVariable("id") Long id, @RequestBody CreateConsumerDto createConsumerDto){
        return consumerService.updateConsumerById(id, createConsumerDto);
    }
}
