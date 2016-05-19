package com.hb.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.domain.Employee;

public class TestMain
{
	
	public static void main(String[] args)
	{
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("huangbin");
		employee.setEmail("ne@lie.cn");
		employee.setHiredate("2016-5-18");
		session.save(employee);
		transaction.commit();
		session.close();
	}

}
