FROM openjdk:8
EXPOSE 8080
ADD target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
ENTRYPOINT ["java","-jar","/ticketbookingmanagementapp.jar"]