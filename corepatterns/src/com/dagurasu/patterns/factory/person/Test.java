package com.dagurasu.patterns.factory.person;

public class Test {

	public static void main(String[] args) {
		Person person1 = PersonFactory.createGender("male");
		person1.wish("I want a new car");
		
		Person person2 = PersonFactory.createGender("female");
		person2.wish("I want a new pair of shoes");
		
	}
}
