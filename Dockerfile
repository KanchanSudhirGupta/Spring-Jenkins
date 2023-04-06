FROM docker/getting-started:latest  
EXPOSE 80
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
CMD ["java","-jar","/ticketbookingmanagementapp.jar"]