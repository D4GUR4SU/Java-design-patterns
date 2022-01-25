package com.dagurasu.patterns.movietickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dagurasu.patterns.movietickets.bo.TicketBO;
import com.dagurasu.patterns.movietickets.services.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService service;
	
	@RequestMapping("/showCreateTicket")
	public String showPageCreateTicket(ModelMap modelMap) {
		modelMap.remove("msg");
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(TicketBO ticket, ModelMap modelMap) {
		service.purchaseTicket(ticket);
		modelMap.addAttribute("msg", "Ticket Purchased successfuly!");
		return "createTicket";
	}
}
