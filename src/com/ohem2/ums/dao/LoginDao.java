package com.ohem2.ums.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ohem2.ums.entity.LoginDTO;
import com.ohem2.ums.entity.Register;
@Repository
public class LoginDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public Register login(LoginDTO loginDTO) {
		Session session = sessionFactory.openSession();
		String hql=" from Register where email=:em and password=:pwd";
		Query query = session.createQuery(hql);
		query.setParameter("em", loginDTO.getEmail());
		query.setParameter("pwd", loginDTO.getPassword());
		Register register =(Register) query.uniqueResult();
		return register;
	}
}
