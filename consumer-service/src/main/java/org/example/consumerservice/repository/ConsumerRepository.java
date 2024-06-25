package org.example.consumerservice.repository;

import org.example.consumerservice.entity.Consumer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ConsumerRepository extends ReactiveCrudRepository<Consumer, Long> {
}
