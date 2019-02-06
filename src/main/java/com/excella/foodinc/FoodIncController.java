package com.excella.foodinc;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class FoodIncController {

    @RequestMapping("/demo")
    public Publisher<String> index() {
         Mono<String> helloWorld = Mono.just("Hello World");
         return helloWorld;
        }
    }
