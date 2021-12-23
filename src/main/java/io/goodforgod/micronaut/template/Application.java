package io.goodforgod.micronaut.template;

import io.goodforgod.micronaut.template.config.SecurityConfig;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.OAuthScope;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SecurityScheme(
        name = SecurityConfig.OAUTH,
        type = SecuritySchemeType.OAUTH2,
        description = "OpenAPI OAUTH2 security schema with JWT token for SSO",
        scheme = "bearer",
        bearerFormat = "JWT",
        flows = @OAuthFlows(
                authorizationCode = @OAuthFlow(
                        authorizationUrl = "https://sso.com/",
                        tokenUrl = "https://sso.com/",
                        scopes = {
                                @OAuthScope(name = SecurityConfig.SCOPE_USER, description = "User Access Scope"),
                        })))
@SecurityScheme(
        name = SecurityConfig.AUTHORIZATION,
        type = SecuritySchemeType.HTTP,
        description = "OpenAPI Authorization Header security schema, injects Authorization Header each request",
        scheme = "bearer",
        in = SecuritySchemeIn.HEADER)
@OpenAPIDefinition(
        info = @Info(
                title = "micronaut-http-template",
                version = "0.9.0-SNAPSHOT",
                description = "micronaut-http-template",
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"),
                contact = @Contact(url = "https://goodforgod.dev", name = "Anton Kurako")),
        servers = {
                @Server(url = "/", description = "Local Server")
        })
public class Application {

    static {
        final String buildNumber = Application.class.getPackage().getImplementationVersion();
        System.setProperty("BUILD_NUMBER", Optional.ofNullable(buildNumber).orElse("1"));
    }

    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Application.class);
        final Collection<String> expected = Set.of("SECURITY_ENABLED");

        final Map<String, String> envs = System.getenv();
        for (String env : expected) {
            logger.debug("{}={}", env, envs.get(env));
        }

        Micronaut.build(args).banner(false).start();
    }
}
