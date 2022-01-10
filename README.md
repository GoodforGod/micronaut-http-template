# Micronaut HTTP Application Template

Template for Micronaut HTTP Application for Java 17+.

## Features
- Gradle, build, wrapper, properties configured.
- [Code Style](https://goodforgod.dev/posts/3/), formatting , .gitignore configured.
- application.yaml, logback.xml, environment variables for local ruin\test configured.
- Dockerfile for packaging application configured.
- [OpenAPI/Swagger-UI/Rapidoc](https://github.com/GoodforGod/micronaut-management-openapi) management configured

## Run

```
./gradlew run
```

## Test

```shell
./gradlew test
```

## Code Style

Code Style is provided and configured with Spotless, you can read more about [Code Style here](https://goodforgod.dev/posts/3/)

Check Code Style:

```shell
./gradlew spotlessCheck
```

Apply Code Style:

```shell
./gradlew spotlessApply
```

## OpenAPI

Library for [OpenAPI/Swagger-UI/Rapidoc](https://github.com/GoodforGod/micronaut-management-openapi)
exposure configured, check library for [more info](https://github.com/GoodforGod/micronaut-management-openapi).

- **/openapi** - OpenAPI endpoint.
- **/swagger-ui** - Swagger-UI endpoint.
- **/rapidoc** - Rapidoc endpoint.
