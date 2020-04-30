package com.ohem2.ums.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ohem2.ums.entity.Register;

@Repository
public class RegisterDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	public void saveRegisterData(Register register) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(register);
			transaction.commit();
		} catch (HibernateException e) {
			System.out.println(e.getStackTrace());
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
