package org.example.consumerservice.mapper;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import org.mapstruct.Mapper;

@Mapper
public interface ConsumerMapper {
    Consumer convertToConsumer(CreateConsumerDto createConsumerDto);
}
