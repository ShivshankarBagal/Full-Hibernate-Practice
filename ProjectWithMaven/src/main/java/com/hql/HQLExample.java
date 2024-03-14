package com.hql;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		//HQL
		
		Query query=session.createQuery("from Student");
		//Query query=session.createQuery("from Student where name='Maharana' ");
		
		//here we can we setParameter query also
		//Query query=session.createQuery("from Student where name=:x ");
		//query.setParameter=("x","Maharana");
		List<Student> list=query.list();
		
		for(Student s: list) {
			System.out.println(s.getname());
		}
		
		
		
		
		session.close();
		factory.close();
		
	}

}
