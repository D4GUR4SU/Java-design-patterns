package com.dagurasu.patterns.command;

public class Person {

	public static void main(String[] args) {

		Television television = new Television();
		RemoteControl control = new RemoteControl();
		
		OnCommand onCommand = new OnCommand(television);
		control.setCommand(onCommand);
		control.pressButton();
		
		OffCommand offCommand = new OffCommand(television);
		control.setCommand(offCommand);
		control.pressButton();
	}
}
