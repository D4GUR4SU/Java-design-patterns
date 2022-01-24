package com.dagurasu.patterns.adapter.weather;

public class WeatherAdapter {

	public int findTemperature(int zipCode) {
		String city = null;

		if (zipCode == 19406) {
			city = "Narnia";
		}

		WeatherFinder finder = new WeatherFinderImpl();
		int temperature = finder.find(city);
		return temperature;
	}
}
