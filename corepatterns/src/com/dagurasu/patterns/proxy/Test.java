package com.dagurasu.patterns.proxy;

public class Test {

	public static void main(String[] args) {
		
		//without proxy pattern
		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrder().size());
		
	}
}
