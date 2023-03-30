package com.infotech.book.ticket.app;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner
{
	@Autowired
	private TicketBookingService ticketBookingService;
	//derby dependency in classpath then creates all required resources which is 
	// mendatory to interact with database. thats why datasource is creaed. autowired so that if in
	//the spring container will be printed.
	@Autowired
	private DataSource dataSource;
	public static Logger logger=LoggerFactory.getLogger(TicketBookingManagementAppApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application started");
	}
	public static void main(String[] args) {
		/*ConfigurableApplicationContext applicationContext= SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		TicketBookingService ticketBookingService=applicationContext.getBean("ticketBookingService",TicketBookingService.class);
		
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassangerName("Aadhavan");
		ticket.setEmail("Aadhavan@gmail.com");
		ticketBookingService.createTicket(ticket);*/
		logger.info("Application executed");
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		}
	
	@Override
	public void run(String...args) throws Exception
	{
		Ticket ticket=new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Pune");
		ticket.setSourceStation("Mumbai");
		ticket.setPassangerName("Aadhavan");
		ticket.setEmail("Aadhavan@gmail.com");
		ticketBookingService.createTicket(ticket);
		System.out.println("DataSource: "+dataSource);
	}

}
