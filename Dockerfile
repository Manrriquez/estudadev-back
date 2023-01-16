FROM maven:3.8.5-openjdk-17 as build
WORKDIR localtime

FROM openjdk:17 as run
COPY target/*.jar .

ENV TZ=America/Sao_Paulo
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ENV LANG=pt_br.UTF-8 LANGUAGE=pt_BR.UTF-8

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "application.jar"]