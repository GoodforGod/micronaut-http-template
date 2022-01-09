package io.goodforgod.micronaut.template.client;

import io.goodforgod.micronaut.template.model.User;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Flux;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 09.01.2022
 */
@Client("/users")
public interface UserClient {

    @Get("/all")
    Flux<User> all();
}
