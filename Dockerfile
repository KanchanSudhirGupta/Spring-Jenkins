# syntax=docker/dockerfile:1.4
FROM azul/zulu-openjdk:11
VOLUME /tmp 
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
ENTRYPOINT ["java","-jar","/ticketbookingmanagementapp.jar"]