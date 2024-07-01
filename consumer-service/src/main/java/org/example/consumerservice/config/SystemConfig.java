package org.example.consumerservice.config;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Timestamp;

@Configuration
public class SystemConfig {
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        return modelMapper;
    }
    @Bean
    public ModelMapper modelMapperV2() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setSkipNullEnabled(true)
                .setDeepCopyEnabled(true)
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setPropertyCondition(ctx -> ctx.getSource() != null);
        return modelMapper;
    }
    @Bean
    public ModelMapper modelMapperV3() {
        Converter<String, Timestamp> stringToIntegerConverter = new AbstractConverter<String, Timestamp>() {
            protected Timestamp convert(String source) {
                // config model object
                return null;
            }
        };
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setSkipNullEnabled(true)
                .setDeepCopyEnabled(true)
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setPropertyCondition(ctx -> ctx.getSource() != null);
        modelMapper.addConverter(stringToIntegerConverter);
        return modelMapper;
    }
}
