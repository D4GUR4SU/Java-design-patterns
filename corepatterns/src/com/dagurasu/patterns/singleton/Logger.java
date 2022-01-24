package com.dagurasu.patterns.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile Logger instance = new Logger();

	private Logger() {

	}

	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	protected void log(String message) {
		System.out.println(message);
	}

}
