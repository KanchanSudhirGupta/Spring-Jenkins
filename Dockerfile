FROM openjdk:8-jre-alpine

RUN apk update && apk add bash
WORKDIR /app
COPY /target/ticketbookingmanagementapp.jar /app
EXPOSE 8080 
CMD ["java","-jar","ticketbookingmanagementapp.jar"]