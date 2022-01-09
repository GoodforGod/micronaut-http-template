package io.goodforgod.micronaut.template.controller;

import io.goodforgod.micronaut.template.client.UserClient;
import io.goodforgod.micronaut.template.model.User;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 09.01.2022
 */
@MicronautTest
class UserControllerTests extends Assertions {

    @Inject
    private UserClient userClient;

    @Test
    void userAllFound() {
        final List<User> found = userClient.all().collectList().block(Duration.ofMinutes(1));
        assertNotNull(found);
        assertEquals(2, found.size());
    }
}
