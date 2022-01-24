package com.dagurasu.patterns.factory.person;

public class Female  implements Person{

	@Override
	public void wish(String msg) {
		System.out.println("I am a female. My wish is: " + msg);
	}
}
