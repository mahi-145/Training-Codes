package com.cg.log.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.log.dto.Users;

@Repository("usrDao")
public class IUserDaoImpl implements IUserDao
{
	@PersistenceContext
	EntityManager em;
	
	@Override
	public String addUsers(Users usr) 
	{
		em.persist(usr);
		em.flush();
		return String.valueOf(usr.getId());
	}

	@Override
	public List<String> getAllUserIds() 
	{
		Query queryone=em.createQuery("SELECT id FROM Users");
		return queryone.getResultList();
	}

	@Override
	public List<String> getAllUserPass()
	{
		Query querytwo=em.createQuery("SELECT password FROM Users");
		return querytwo.getResultList();
	}

}
