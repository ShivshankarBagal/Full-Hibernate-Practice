package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//Update, Delete HQL QUery
public class UpdateExample {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		//update HQL Query
		
		Query query=session.createQuery("update Student set name=:n, course=:c where id=:i");
		query.setParameter("n", "Ramesh");
		query.setParameter("c", "Java Developer");
		query.setParameter("i", 2);
		
		int status=query.executeUpdate();
		System.out.println("Updated rows: "+status);
		
		
		
		//Delete Query HQL
		//Query query=session.createQuery("delete from Student  where id=:i");
		
		
		
		tx.commit();
		factory.close();
		session.close();
		
	}

}
