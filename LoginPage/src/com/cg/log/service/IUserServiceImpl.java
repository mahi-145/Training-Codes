package com.cg.log.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.log.dao.IUserDao;
import com.cg.log.dto.Users;
@Service("usrSer")
@Transactional
public class IUserServiceImpl implements IUserService
{
	@Autowired
	IUserDao usrDao;
	@Override
	public String addUsers(Users usr) 
	{
		return usrDao.addUsers(usr);
	}

	@Override
	public List<String> getAllUserIds() 
	{
		return usrDao.getAllUserIds();
	}

	@Override
	public List<String> getAllUserPass() 
	{
		return usrDao.getAllUserPass();
	}

	@Override
	public boolean validateUserId(String id)
	{
		List<String>allIds=(List<String>)usrDao.getAllUserIds();
		for(String i:allIds)
		{
			if(i.equals(id))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean validateUserPass(String pass) 
	{
		List<String>allpass=(List<String>)usrDao.getAllUserPass();
		for(String i:allpass)
		{
			if(i.equals(pass))
			{
				return true;
			}
		}
		return false;
	}

}
