package com.hql.Connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.Model.Product;

public class Connection {



	private static SessionFactory fac;
	public Connection()
	{
		fac=new Configuration().configure("hiber.config.xml").addAnnotatedClass(Product.class).buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFact()
	{
		Connection c=new Connection();
		return fac;
	}
	
}
