package com.bridglabz.greetingreactive.repository;

import com.bridglabz.greetingreactive.model.Greeting;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IGreetingRepository extends R2dbcRepository<Greeting,Integer> {
}
