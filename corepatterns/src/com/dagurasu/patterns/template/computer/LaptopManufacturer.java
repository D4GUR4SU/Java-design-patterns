package com.dagurasu.patterns.template.computer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Adding Hard Disk in your Laptop");
	}

	@Override
	public void addRam() {
		System.out.println("Adding RAM in your Laptop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Adding Keyboard in your Laptop");
	}
}
