package com.hb.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryRegistry;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MySessionFactory
{
	private static SessionFactory sessionFactory=null;
	public MySessionFactory()
	{
		
	}
	static
	{
		Configuration configuration = new Configuration().configure();
		ServiceRegistry sessionrigistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(sessionrigistry);
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
	
	

}
