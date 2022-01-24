package com.dagurasu.patterns.adapter.payment;

public class PaymentApp {

	public void pay(int rupees) {
		PaymentAdapter adapter = new PaymentAdapter();
		adapter.payt(rupees);
	}

	public static void main(String[] args) {
		PaymentApp app = new PaymentApp();
		app.pay(100);
	}
}
