FROM openjdk:8-jdk-alpine AS java-base

ARG DD_LIB=https://search.maven.org/classic/remotecontent?filepath=com/datadoghq/dd-java-agent/0.50.0/dd-java-agent-0.50.0.jar
RUN wget -O dd-java-agent.jar ${DD_LIB}
RUN addgroup -S illimity && adduser -S -G illimity illimity
RUN mkdir /app
RUN chown illimity:illimity /app

ARG JAR_FILE=target/prova.jar
ADD ${JAR_FILE} /app/prova.jar

RUN mv dd-java-agent.jar /app/dd-java-agent.jar

FROM gcr.io/distroless/java:11

COPY --from=java-base /etc/passwd /etc/group /etc/shadow /etc/
COPY --from=java-base /app /app

EXPOSE 8080

USER illimity

VOLUME /tmp

ENTRYPOINT ["java", "-Xmx2g", "-javaagent:/app/dd-java-agent.jar", "-jar", "/app/prova.jar"]