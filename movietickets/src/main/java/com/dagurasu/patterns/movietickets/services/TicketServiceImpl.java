package com.dagurasu.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dagurasu.patterns.movietickets.bo.TicketBO;
import com.dagurasu.patterns.movietickets.dao.TicketDAO;
import com.dagurasu.patterns.movietickets.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDAO dao;

	@Override
	public void purchaseTicket(TicketBO ticket) {

		Ticket ticketEnity = new Ticket();
		ticketEnity.setId(ticket.getId());
		ticketEnity.setMovie(ticket.getMovieName());
		ticketEnity.setScreen(ticket.getScreenNo());
		ticketEnity.setSeat(ticket.getSeatNo());
		
		dao.create(ticketEnity);
	}
}
