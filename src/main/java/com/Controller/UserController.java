package com.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Model.User;
import com.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	
	@RequestMapping( value="/",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String test(){
		return "{msg:SpringBootJdbc}";
	}
	
	@RequestMapping( value="/users",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Collection<User> index(ModelMap modelMap){
		return service.findAll();
		//dao.findAll()
	}
	
}
 