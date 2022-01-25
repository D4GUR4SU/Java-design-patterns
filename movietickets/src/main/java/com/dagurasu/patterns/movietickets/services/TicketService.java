package com.dagurasu.patterns.movietickets.services;

import com.dagurasu.patterns.movietickets.bo.TicketBO;

public interface TicketService {

	void purchaseTicket(TicketBO ticket);
	
}
