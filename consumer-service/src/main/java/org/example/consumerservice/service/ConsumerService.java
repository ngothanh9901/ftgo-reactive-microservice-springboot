package org.example.consumerservice.service;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import reactor.core.publisher.Mono;

public interface ConsumerService {
    Mono<Consumer> create(CreateConsumerDto createConsumerDto);
    Mono<Consumer> getConsumerById(Long id);
    Mono<Consumer> updateConsumerById(Long id, CreateConsumerDto updateConsumerDto);
}
