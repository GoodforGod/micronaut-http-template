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
public record User(@Schema(description = "User wID") UUID id,
                   @Schema(description = "User name", example = "bob") String name) {}
