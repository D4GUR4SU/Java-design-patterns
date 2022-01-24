package com.dagurasu.patterns.template.computer;

public class Test {

	public static void main(String[] args) {
		ComputerManufacturer desktop = new DesktopManufacturer();
		desktop.buildComputer();
		
		ComputerManufacturer laptop = new LaptopManufacturer();
		laptop.buildComputer();
	}
}
