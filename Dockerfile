FROM bellsoft/liberica-openjre-alpine-musl:17.0.1

ARG APP_DIR=/opt/application
ARG BUILD_DIR=build/libs

RUN mkdir -p "$APP_DIR"
COPY $BUILD_DIR/*all.jar $APP_DIR/application.jar

ENV JAVA_OPTS = '-Xms32m \
    -Xss512k \
    -XX:+ExitOnOutOfMemoryError \
    -XX:+CompactStrings \
    -XX:+UseContainerSupport \
    -XX:+UnlockExperimentalVMOptions \
    -XX:+UseShenandoahGC'

EXPOSE 8080/tcp
ENTRYPOINT ["java", "-Dfile.encoding=UTF-8", "-jar", "/opt/application/application.jar" ]