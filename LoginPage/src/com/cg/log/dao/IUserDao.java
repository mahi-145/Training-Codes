package com.cg.log.dao;

import java.util.List;

import com.cg.log.dto.Users;

public interface IUserDao 
{
	public String addUsers(Users usr);
	public List<String>getAllUserIds();
	public List<String> getAllUserPass();
}
