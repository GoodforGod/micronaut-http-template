package io.goodforgod.micronaut.template.model;

import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 07.12.2021
 */
@Schema(description = "User")
@Introspected
public class User {

    @Schema(description = "User wID")
    private final UUID id;
    @Schema(description = "User name", example = "bob")
    private final String name;

    public User(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
