package com.dagurasu.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoApplicationTests {

	@Autowired
	EmployeeDAO dao;
	
	@Autowired
	StudentDAO sdao;
	
	@Test
	void contextLoads() {
		
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Théo");
		
		dao.create(employee);
		
		Student student = new Student();
		student.setId(1);
		student.setName("Douglas");
		student.setScore(1500);
		sdao.create(student);
	}
}
