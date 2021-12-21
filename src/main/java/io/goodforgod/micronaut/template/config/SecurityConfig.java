package io.goodforgod.micronaut.template.config;

/**
 * @author Anton Kurako (GoodforGod)
 * @since 21.12.2021
 */
public final class SecurityConfig {

    private SecurityConfig() {}

    public static final String AUTHORIZATION = "Authorization";
    public static final String OAUTH = "http-auth";

    public static final String SCOPE_USER = "user";
}
