package io.goodforgod.micronaut.template.controller;

import io.goodforgod.micronaut.template.config.SecurityConfig;
import io.goodforgod.micronaut.template.model.User;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import io.micronaut.http.hateoas.JsonError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.util.UUID;
import reactor.core.publisher.Flux;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 07.12.2021
 */
@Introspected
@Controller("/users")
public class UserController {

    @SecurityRequirement(name = SecurityConfig.AUTHORIZATION)
    @SecurityRequirement(name = SecurityConfig.OAUTH, scopes = SecurityConfig.SCOPE_USER)
    @Operation(operationId = "userAll",
            summary = "Stream all users",
            tags = { "User" },
            responses = {
                    @ApiResponse(responseCode = "500",
                            description = "Unexpected error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON,
                                    schema = @Schema(implementation = JsonError.class))),
            })
    @Get(produces = MediaType.APPLICATION_JSON_STREAM)
    Flux<User> allStream() {
        return all();
    }

    @SecurityRequirement(name = SecurityConfig.AUTHORIZATION)
    @SecurityRequirement(name = SecurityConfig.OAUTH, scopes = SecurityConfig.SCOPE_USER)
    @Operation(operationId = "userAll",
            summary = "Find all users",
            tags = { "User" },
            responses = {
                    @ApiResponse(responseCode = "500",
                            description = "Unexpected error",
                            content = @Content(mediaType = MediaType.APPLICATION_JSON,
                                    schema = @Schema(implementation = JsonError.class))),
            })
    @Get("/all")
    Flux<User> all() {
        return Flux.just(new User(UUID.randomUUID(), "Bob"), new User(UUID.randomUUID(), "Tom"));
    }
}
