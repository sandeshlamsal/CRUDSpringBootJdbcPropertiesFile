package com.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.UserModel;

@RestController
public class UserController {
	JdbcTemplate jt = new JdbcTemplate();
	DataSource ds;
	ArrayList<UserModel> users;
	
	@RequestMapping( value="/users",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	
	public ArrayList<UserModel>  showUsers(){
		
		String qry="select * from user";
		ArrayList<UserModel> users=new ArrayList<UserModel>();
		List<Map> rows=getJdbcTemplate().queryForList(sql);
		for(Map row:rows){
			UserModel u1=new UserModel();
			u1.setId((Integer)row.get("id"));
			u1.setName((String)row.get("name"));
			u1.setPass((String)row.get("pass"));
			users.add(u1);
		}
		return users;
	}
}
 