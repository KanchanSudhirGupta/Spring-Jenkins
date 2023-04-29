package com.infotech.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@GetMapping(value="/hello")
	public String helloString()
	{
		return "Hello";
	}
	
	@PostMapping(value="/create")
	//RequestBody converts JSON data to java object
	public Ticket createTicket(@RequestBody Ticket ticket)
	{
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId)
	{
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@GetMapping(value="/ticket/allTickets")
	//findAll() in crudRepository is having Iterable as return datatype
	public Iterable<Ticket> getAllTickets()
	{
		return ticketBookingService.getAllTickets();
	}
	
	@DeleteMapping(value="/ticket/{ticketId}")
	//httpstatus 200 OK means ticket is deleted 
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId)
	{
		ticketBookingService.deleteTicket(ticketId);
	}
	//with RegularExpression .+ is defined bcoz in email after . like .com is truncated so to remain this one too
	//in regularexpression of emailId .+ is used 
	@PutMapping(value="/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail") String newEmail)
	{
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
}
