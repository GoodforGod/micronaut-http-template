package io.goodforgod.micronaut.template.controller;


import io.goodforgod.micronaut.template.model.dao.User;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import reactor.core.publisher.Flux;


/**
 * @author Anton Kurako (GoodforGod)
 * @since 07.12.2021
 */
@Introspected
@Controller("/users")
public class UserController {

    @Get(value = "/stream", produces = MediaType.APPLICATION_JSON_STREAM)
    Flux<User> allStream() {
        return all();
    }

    @Get
    Flux<User> all() {
        return Flux.just(new User("Bob"), new User("Tom"));
    }
}
