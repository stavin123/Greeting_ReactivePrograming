package com.bridglabz.greetingreactive.controller;

import com.bridglabz.greetingreactive.model.Greeting;
import com.bridglabz.greetingreactive.model.Response;
import com.bridglabz.greetingreactive.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    @Autowired
    private IGreetingService service;

    @PostMapping("/addgreeting")
    public Mono<Greeting> saveGreeting(@RequestBody Greeting greeting){
        return service.saveGreeting(greeting);
    }

    @GetMapping("/showgreeting")
    public Flux<Greeting> getAllGreeting() {
        return service.getGreeting();
    }


    @GetMapping("/showgreetingbyid/{id}")
    public Mono<Greeting> getGreetingByID(@PathVariable int id) {
        return service.getGreetingById(id);
    }

    @DeleteMapping("/removegreeting/{id}")
    public Mono<Void> deleteGreeting(@PathVariable int id) {
        return service.deleteGreeting(id);
    }

}