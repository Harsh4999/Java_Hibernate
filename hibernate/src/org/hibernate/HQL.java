package org.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.entity.alien;

public class HQL {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(alien.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			//begin transaction
			session.beginTransaction();
			
			//creating query to retrieve whole table = select * from alien
		//	List<alien> aliens=	 session.createQuery("from alien").getResultList();  //here from users means that refer to entity
			
			//using where condition with both table column name & entity column name
				//	List<alien> aliens = session.createQuery("from alien where name='harsh'").getResultList(); //used table column name 
				//	List<alien> aliens = session.createQuery("from alien where name = 'jjj' or id=1").getResultList(); //note here we can replace name with the entity class name
	/*		for (alien alien : aliens) {
				System.out.println(alien);
			} */
			
			//updating the records = update alien set ? where ?
				//session.createQuery("update alien set name='rahul' where id=10").executeUpdate();	//updating the table using hibernate		
			
			//deleting a record = delete from alien where ?
		//	session.createQuery("delete from alien where id=10").executeUpdate(); //deleting the record
			
			//end transaction
			session.getTransaction().commit();
			
		}finally {
			session.close();
			factory.close();
		}
	}	
}
