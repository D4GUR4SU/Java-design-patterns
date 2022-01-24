package com.dagurasu.patterns.template.data;

public class XMLDataRenderer extends DataRenderer{

	@Override
	public String readData() {
		return "XMl Data";
	}

	@Override
	public String processData(String data) {
		return "Processed " + data;
	}
}
