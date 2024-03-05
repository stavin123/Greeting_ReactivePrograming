package com.bridglabz.greetingreactive.service;

import com.bridglabz.greetingreactive.model.Greeting;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IGreetingService {
    Mono<Greeting> saveGreeting(Greeting greeting);

    Flux<Greeting> getGreeting();
    Mono<Greeting> getGreetingById(int id);

    Mono<Void> deleteGreeting(int id);
}
