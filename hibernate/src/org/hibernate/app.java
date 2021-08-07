package org.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.entity.alien;

public class app {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(alien.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			//create object of entity class
			//alien a  = new alien(10,"jjj"); for inseting alien object
		//	alien a = new alien(); for retriving value from db
		//	alien a = new alien(); for updating in db
		//	alien a = new alien(); for deleting in db
			
			//starting transaction
			session.beginTransaction();
	
			//perform operation
		
			//1)	session.save(a); save means insertion
			//2)	a = session.get(alien.class, 10); retrieving value from database
		
			//3)		a= session.get(alien.class, 10); //we will retrieve object we want to update
			//		a.setName("rahul");  now from here we can update the object except updating PRIMARY_KEY
		
			//4)	a=session.get(alien.class, 10); same in delete opertation we will first fetch the record
			//	session.delete(a); //then tell session to delete it
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done");
		//	System.out.println(a); printing the object from 2nd operation
		}finally {
			session.close();
			factory.close();
		}
	}
}
