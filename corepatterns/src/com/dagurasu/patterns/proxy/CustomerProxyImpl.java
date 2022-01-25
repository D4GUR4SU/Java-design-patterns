package com.dagurasu.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

	CustomerImpl customer = new CustomerImpl();

	@Override
	public int getId() {
		return customer.getId();
	}

	@Override
	public List<Order> getOrder() {

		ArrayList<Order> orders = new ArrayList<>();
		
		Order order1 = new Order();
		order1.setId(1);
		order1.setProductName("Xiaomi");
		order1.setQuantity(150);
		orders.add(order1);

		Order order2 = new Order();
		order2.setId(2);
		order2.setProductName("Iphone");
		order2.setQuantity(50);
		orders.add(order2);

		return orders;
	}
}
