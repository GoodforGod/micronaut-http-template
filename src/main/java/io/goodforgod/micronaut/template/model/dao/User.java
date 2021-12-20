package io.goodforgod.micronaut.template.model.dao;


import io.micronaut.core.annotation.Introspected;
import java.util.UUID;


/**
 * @author Anton Kurako (GoodforGod)
 * @since 07.12.2021
 */
@Introspected
public class User {

    private final UUID id = UUID.randomUUID();
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
