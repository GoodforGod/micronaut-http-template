# Micronaut Http Application Template

Template for Micronaut application for Java 11+.

## Features
- Micronaut Plugin configured
- Spotless for Code Style and Formatting.
- .gitignore and .gitattributes for proper ignore and symbols check.
- .editorconfig for simple configs code style and encoding UTF-8.
- Proper Gradle and Gradle Wrapper configuration.
- application.yaml with basic setup
- logback.xml configuration
- Dockerfile for packaging application
- ShadowJar configured
- JaCoCo configured
- Test and Run sections configured
- Test and runtime dependencies' setup for basic application
- OpenAPI/Swagger-UI/Rapidoc management configured

## Run

```
gradlew run
```

## Code Style

Code Style is provided and configured with Spotless, you can read more about [Code Style here](https://goodforgod.dev/posts/3/)

### Check

```shell
./gradlew spotlessCheck
```

### Apply

```shell
./gradlew spotlessApply
```

## Test

```shell
./gradlew test
```

## OpenAPI

Template configured OpenAPI/Swagger-UI/Rapidoc exposure and you can access they after running service.

- **/openapi** - Here is OpenAPI file is available.
- **/swagger-ui** - Here is Swagger-UI file is available.
- **/rapidoc** - Here is Rapidoc file is available.
