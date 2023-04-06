FROM docker/getting-started:latest  
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
CMD ["java","-jar","/ticketbookingmanagementapp.jar"]