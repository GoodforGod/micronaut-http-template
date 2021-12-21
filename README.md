# Micronaut Http Application Template

Template for Micronaut application for Java 11+.

## Features
- Micronaut Plugin configured
- Spotless for [Code Style](https://goodforgod.dev/posts/3/) and Formatting.
- .gitignore and .gitattributes for proper ignore and symbols check.
- .editorconfig for simple configs code style and encoding UTF-8.
- Proper Gradle and Gradle Wrapper configuration.
- application.yaml with basic setup
- logback.xml configuration
- Dockerfile for packaging application
- ShadowJar configured
- JaCoCo configured
- Test and Run sections configured
- [OpenAPI/Swagger-UI/Rapidoc](https://github.com/GoodforGod/micronaut-management-openapi) management configured

### Run

```
gradlew run
```

### Code Style

Code Style is provided and configured with Spotless, you can read more about [Code Style here](https://goodforgod.dev/posts/3/)

Check Code Style:

```shell
gradlew spotlessCheck
```

Apply Code Style:

```shell
gradlew spotlessApply
```

## Test

```shell
gradlew test
```

## OpenAPI

Template configured [OpenAPI/Swagger-UI/Rapidoc])(https://github.com/GoodforGod/micronaut-management-openapi)
exposure and you can access they after running service.

- **/openapi** - OpenAPI endpoint.
- **/swagger-ui** - Swagger-UI endpoint.
- **/rapidoc** - Rapidoc endpoint.
