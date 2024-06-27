package org.example.consumerservice.mapper;

import org.example.consumerservice.dto.CreateConsumerDto;
import org.example.consumerservice.entity.Consumer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
@Mapper(componentModel = "spring")
public interface ConsumerMapper {
    Consumer convertToConsumer(CreateConsumerDto createConsumerDto);
}
