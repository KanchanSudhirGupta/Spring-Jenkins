FROM anapsix/alpine-java 
COPY target/ticketbookingmanagementapp.jar ticketbookingmanagementapp.jar 
CMD ["java","-jar","/ticketbookingmanagementapp.jar"]