FROM openjdk:8-jre-alpine
RUN usermod -a -G docker jenkins
RUN apk update && apk add bash
WORKDIR /app
COPY /target/ticketbookingmanagementapp.jar /app
EXPOSE 8080 
ENTRYPOINT ["java","-jar","ticketbookingmanagementapp.jar"]