package org.example.consumerservice.service.impl;

import lombok.AllArgsConstructor;
import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import org.example.consumerservice.mapper.ConsumerMapper;
import org.example.consumerservice.repository.ConsumerRepository;
import org.example.consumerservice.service.ConsumerService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
@Service
@AllArgsConstructor
public class ConsumerServiceImpl implements ConsumerService {
    private ConsumerRepository consumerRepository;
    private ConsumerMapper consumerMapper;
    @Override
    public Mono<Consumer> create(Mono<CreateConsumerDto> createConsumerDto) {
        return createConsumerDto
                .map(consumerMapper::convertToConsumer)
                .flatMap(consumerRepository::save);
    }
}
