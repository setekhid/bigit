FROM maven:3.5-jdk-7-onbuild-alpine AS builder
COPY . /usr/src/app
RUN mvn install

# FROM jetty:9.4
