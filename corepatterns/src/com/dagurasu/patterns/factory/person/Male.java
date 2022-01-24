package com.dagurasu.patterns.factory.person;

public class Male implements Person{

	@Override
	public void wish(String msg) {
		System.out.println("I am a male. My wish is: " + msg);
	}
}
