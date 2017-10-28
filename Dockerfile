FROM maven:3.5-jdk-7-alpine AS builder
COPY . /usr/src/app
RUN mvn package

FROM jetty:9.4-alpine
COPY --from builder ./http/target/bigit-http-*.war /var/lib/jetty/webapps/bigit.war
