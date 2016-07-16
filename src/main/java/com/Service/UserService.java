package com.Service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Model.User;
import com.dao.UserDAO;  

@Service 
public class UserService{
     
	@Autowired
	private UserDAO userDao;

	public Collection<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

		
}

