package com.dagurasu.patterns.movietickets.dao;

import org.springframework.stereotype.Repository;

import com.dagurasu.patterns.movietickets.model.Ticket;

@Repository
public interface TicketDAO {

	void create(Ticket ticket);
}
