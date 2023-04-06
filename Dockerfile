FROM docker/getting-started 
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
CMD ["java","-jar","/ticketbookingmanagementapp.jar"]