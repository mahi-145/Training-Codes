package com.cg.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.log.service.IUserService;

@Controller
public class LoginController 
{
	@Autowired IUserService usrService;
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String getAll()
	{
		return "Welcome";
	}
}
