package com.dagurasu.patterns.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

	private int id;
	private List<Order> order;

	CustomerImpl() {
		this.id = 123;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
}
