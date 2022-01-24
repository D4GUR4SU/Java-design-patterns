package com.dagurasu.patterns.adapter.payment;

public class PaymentAdapter {

	public void payt(int rupees) {
		int dollars = rupees * 70;
		PaymentProcessor processor = new PaymentProcessorImpl();
		processor.pay(dollars);
	}
}
