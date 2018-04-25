package com.cg.log.service;

import java.util.List;

import com.cg.log.dto.Users;

public interface IUserService 
{
	public String addUsers(Users usr);
	public List<String>getAllUserIds();
	public List<String> getAllUserPass();
	
	public boolean validateUserId(String id);
	public boolean validateUserPass(String pass);
}
