package org.example.consumerservice.service;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import reactor.core.publisher.Mono;

public interface ConsumerService {
    Mono<Consumer> create(Mono<CreateConsumerDto> createConsumerDto);
}
