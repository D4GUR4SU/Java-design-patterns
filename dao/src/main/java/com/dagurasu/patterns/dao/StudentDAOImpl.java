package com.dagurasu.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Student student) {
		String query = "insert into student values(?, ?, ?)";
		jdbcTemplate.update(query, student.getId(), student.getName(), student.getScore());
	}

	@Override
	public void delete(Student student) {
		String query = "delete student where id = ? ";
		jdbcTemplate.update(query, student.getId());
	}
}
