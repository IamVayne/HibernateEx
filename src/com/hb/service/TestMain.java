package com.hb.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hb.domain.Employee;
import com.hb.util.MySessionFactory;

public class TestMain
{
	
	public static void main(String[] args)
	{
		updataEmployee();
	}

	public static void updataEmployee()
	{
		SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = (Employee) session.load(Employee.class,1);
		employee.setEmail("pingre");
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	public static void addEmployee()
	{
		SessionFactory sessionFactory = MySessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("huangin");
		employee.setEmail("ne@lie.cn");
		employee.setHiredate("2016-5-18");
		session.save(employee);
		transaction.commit();
		session.close();
	}

}
