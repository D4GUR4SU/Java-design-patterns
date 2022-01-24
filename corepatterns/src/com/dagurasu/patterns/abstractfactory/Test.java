package com.dagurasu.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {

		DaoAbstractFatory xml = DaoFactoryProducer.produce("xml");
		Dao daoEmp = xml.createDao("emp");
		daoEmp.save();

		DaoAbstractFatory db = DaoFactoryProducer.produce("db");
		Dao daoDept = db.createDao("dept");
		daoDept.save();
	}
}
