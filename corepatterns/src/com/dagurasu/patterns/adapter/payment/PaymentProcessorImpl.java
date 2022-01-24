package com.dagurasu.patterns.adapter.payment;

public class PaymentProcessorImpl implements PaymentProcessor{

	@Override
	public void pay(int dollars) {
		System.out.println("You paying in dollar: U$" + dollars);
	}
}
