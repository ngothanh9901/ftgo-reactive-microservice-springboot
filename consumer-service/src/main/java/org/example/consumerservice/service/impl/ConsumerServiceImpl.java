package org.example.consumerservice.service.impl;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import org.example.consumerservice.mapper.ConsumerMapper;
import org.example.consumerservice.repository.ConsumerRepository;
import org.example.consumerservice.service.ConsumerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    private final ConsumerRepository consumerRepository;
    private final ConsumerMapper consumerMapper;
    private final ModelMapper modelMapperV2;

    public ConsumerServiceImpl(ConsumerRepository consumerRepository, ConsumerMapper consumerMapper, ModelMapper modelMapperV2) {
        this.consumerRepository = consumerRepository;
        this.consumerMapper = consumerMapper;
        this.modelMapperV2 = modelMapperV2;
    }
    private Mono<Boolean> createValidate(CreateConsumerDto createConsumerDto){
        return Mono.zip(
                consumerRepository.existsByIdentity(createConsumerDto.getIdentity()),
                consumerRepository.existsByEmail(createConsumerDto.getEmail())
        ).flatMap(tuple -> {
            boolean identityExist = tuple.getT1();
            boolean emailExist = tuple.getT2();
            if (identityExist) {
                return Mono.error(new IllegalArgumentException("Identity already exists"));
            }
            if (emailExist) {
                return Mono.error(new IllegalArgumentException("Email already exists"));
            }
            return Mono.just(true);
        });
    }
    @Override
    public Mono<Consumer> create(CreateConsumerDto createConsumerDto) {
        return createValidate(createConsumerDto)
                .map(x -> consumerMapper.convertToConsumer(createConsumerDto))
                .flatMap(consumerRepository::save);
    }

    @Override
    public Mono<Consumer> getConsumerById(Long id) {
        return consumerRepository.findById(id);
    }

    @Override
    public Mono<Consumer> updateConsumerById(Long id, CreateConsumerDto updateConsumerDto) {
        return consumerRepository.findById(id)
                .flatMap(existingConsumer -> {
                    modelMapperV2.map(updateConsumerDto, existingConsumer);
                    return consumerRepository.save(existingConsumer);
                });
    }
}
