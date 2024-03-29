package com.sujata.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		
		sessionFactory=metadata.getSessionFactoryBuilder().build();
		
		return sessionFactory;
	}
}
