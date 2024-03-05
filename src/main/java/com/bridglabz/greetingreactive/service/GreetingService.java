package com.bridglabz.greetingreactive.service;

import com.bridglabz.greetingreactive.model.Greeting;
import com.bridglabz.greetingreactive.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GreetingService implements IGreetingService {


    @Autowired
    private IGreetingRepository repository;

    @Override
    public Mono<Greeting> saveGreeting(Greeting greeting) {
        return repository.save(greeting);
    }

    @Override
    public Flux<Greeting> getGreeting() {
        return repository.findAll();
    }

    @Override
    public Mono<Greeting> getGreetingById(int id) {
        return repository.findById(id);
    }


    public Mono<Void> deleteGreeting(int id) {
        return repository.deleteById(id).then();
    }
}
