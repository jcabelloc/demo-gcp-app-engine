package com.gcp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Integer save(Test test) {
		Session session = sessionFactory.getCurrentSession();
		return (Integer)session.save(test);
	}
	
}
