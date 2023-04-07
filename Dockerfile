# syntax=docker/dockerfile:1.4
RUN --mount=type=bind
RUN --mount=type=cache
FROM azul/zulu-openjdk:11
VOLUME /tmp 
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
ENTRYPOINT ["java","-jar","/ticketbookingmanagementapp.jar"]