package com.hibernate.studentcertmanytoone.com.hibernate.studentcertmanytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class VehiUserMain {
 
	public static void main(String[] args) {
		UserDetails user = new UserDetails(); //create an user entity
 
		Vehicle vehicle = new Vehicle(); //create a vehicle entity
		Vehicle vehicle2 = new Vehicle(); //create second vehicle entity
 
		vehicle.setVehicleName("BMW Car"); //set BMW car
		vehicle.setUser(user); //set user for that car
 
		vehicle2.setVehicleName("AUDI Car"); //set second car Audi
		vehicle2.setUser(user);//set user for that car
 
		user.setUserName("Dinesh Rajput"); //set user property
 
		SessionFactory sessionFactory = new Configuration().configure("hiber.cfg.xml").buildSessionFactory(); //create the session factory object
		Session session = sessionFactory.openSession(); //create the session object
		session.beginTransaction(); //create the transaction object
		session.save(vehicle);
		session.save(vehicle2);
		session.save(user);
		session.getTransaction().commit();
		session.close();
 
	}
 
}
