package com.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Model.User;

@Repository
public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Collection<User> findAll() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query("select * from user", 
				new BeanPropertyRowMapper<User>(User.class));
	}
}
