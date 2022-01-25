package com.dagurasu.patterns.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dagurasu.patterns.movietickets.model.Ticket;

@Repository
public class TicketDAOImpl implements TicketDAO {

	private static final String query = "insert into ticket (movie, screen, seat) values(?, ?, ?)";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Ticket ticket) {
		jdbcTemplate.update(query, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());
	}
}
