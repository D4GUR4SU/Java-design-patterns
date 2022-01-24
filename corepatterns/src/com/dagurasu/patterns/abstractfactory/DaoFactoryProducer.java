package com.dagurasu.patterns.abstractfactory;

public class DaoFactoryProducer {

	public static DaoAbstractFatory produce(String factoryType) {
		DaoAbstractFatory daf = null;

		if (factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		} else if (factoryType.equals("db")) {
			daf = new DBDaoFactory();
		}
		return daf;
	}
}
