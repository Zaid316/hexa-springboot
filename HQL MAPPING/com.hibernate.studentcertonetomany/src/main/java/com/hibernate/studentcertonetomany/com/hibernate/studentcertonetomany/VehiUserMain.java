package com.hibernate.studentcertonetomany.com.hibernate.studentcertonetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class VehiUserMain {
 
	public static void main(String[] args) {
		UserDetails user = new UserDetails(); //create the user entity object
 
		Vehicle vehicle = new Vehicle(); //create the first vehicle entity object
		Vehicle vehicle2 = new Vehicle(); //create the second vehicle entity
 
		vehicle.setVehicleName("BMW Car"); //set the value to the vehicle entity
		vehicle2.setVehicleName("AUDI Car");
 
		user.setUserName("Dinesh Rajput"); //Set the value to the user entity
		user.getVehicle().add(vehicle); //add vehicle to the list of the vehicle
		user.getVehicle().add(vehicle2);
		SessionFactory sessionFactory = new Configuration().configure("hiber.cfg.xml").buildSessionFactory(); //create session factory object
		Session session = sessionFactory.openSession(); //create the session object
		session.beginTransaction(); //start the transaction of the session object
 
		session.save(vehicle); //saving the vehicle to the database
		session.save(vehicle2);
		session.save(user); //save the user to the database
 
		session.getTransaction().commit(); //close the transaction
		session.close(); //close the session
 
	}
 
}