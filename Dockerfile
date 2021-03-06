FROM openjdk:11-jre-slim
LABEL maintainer="jehyn923@gmail.com"
VOLUME /tmp
ARG JAR_FILE=./build/libs/*.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8085
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./uradom","-jar","/app.jar"]