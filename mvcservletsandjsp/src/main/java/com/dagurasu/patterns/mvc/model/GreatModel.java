package com.dagurasu.patterns.mvc.model;

public class GreatModel {

	public int greatNumber(int num1, int num2) {

		int greatNumber = 0;
		if (num1 > num2) {
			greatNumber = num1;
			return greatNumber;
		} else if (num1 < num2) {
			greatNumber = num2;
			return greatNumber;
		}
		return greatNumber;
	}
}
