FROM maven:3.8.5-openjdk-17 as build
#WORKDIR /build
#COPY . .
#COPY target/*.jar .
WORKDIR localtime
#RUN mvn clean package -DskipTests

FROM openjdk:17 as run
#WORKDIR /app
#COPY target/*.jar ./app
RUN mkdir app
ADD ./target/*.jar application.jar
COPY ./target/*.jar /app/application.jar
WORKDIR /app
#COPY --from=build ./build/target/*.jar ./application.jar
EXPOSE 8080
#ENTRYPOINT java -jar application.jar
ENV TZ=America/Sao_Paulo
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ENV LANG=pt_br.UTF-8 LANGUAGE=pt_BR.UTF-8

ENTRYPOINT ["java", "-jar", "application.jar"]