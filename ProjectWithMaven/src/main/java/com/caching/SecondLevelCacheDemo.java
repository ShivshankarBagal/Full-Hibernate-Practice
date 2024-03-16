package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Student;


public class SecondLevelCacheDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		//   1st session
		Session session=factory.openSession();

		Student student = session.get(Student.class, 1);
		//here we get student data using session and then close session		
		System.out.println(student);
		session.close();
		
		
		//2nd session
		Session session2=factory.openSession();
		
		Student student2 = session2.get(Student.class, 1);
		System.out.println(student2);
		session2.close();
		
		
		factory.close();
		
		
		
	}

}
