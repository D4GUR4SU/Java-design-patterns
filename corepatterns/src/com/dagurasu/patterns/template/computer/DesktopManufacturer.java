package com.dagurasu.patterns.template.computer;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Adding Hard Disk in your Desktop");
	}

	@Override
	public void addRam() {
		System.out.println("Adding RAM in your Desktop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Adding Keyboard in your Desktop");
	}
}
