FROM alpine/git 
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
CMD ["java","-jar","/ticketbookingmanagementapp.jar"]