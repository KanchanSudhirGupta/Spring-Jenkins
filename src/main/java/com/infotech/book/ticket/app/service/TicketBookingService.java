package com.infotech.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBookingDao.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketBookingDao.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketBookingDao.delete(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		// TODO Auto-generated method stub
		Ticket updateTicket= ticketBookingDao.findOne(ticketId);
		updateTicket.setEmail(newEmail);
		return ticketBookingDao.save(updateTicket);
	}

	
}
