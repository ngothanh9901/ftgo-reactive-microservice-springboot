package org.example.consumerservice.repository;

import org.example.consumerservice.entity.Consumer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ConsumerRepository extends ReactiveCrudRepository<Consumer, Long> {
    Mono<Boolean> existsByIdentity(String identity);
    Mono<Boolean> existsByEmail(String email);
}
