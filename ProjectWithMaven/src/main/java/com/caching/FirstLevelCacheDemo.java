package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class FirstLevelCacheDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		//First level cache is by Default enable
		
		Student student=session.get(Student.class, 2);
		System.out.println(student);
		
		System.out.println("Working somthing  and then print again same student");
		
		
		//here hibernate not fire query again because it check object is present in session object if present it call this object, 
		Student student2=session.get(Student.class, 2);
		System.out.println(student2);
		
		//contains() check Check if the instance is a managed 
		//entity instance belonging to the current persistence context.
		System.out.println(session.contains(student2));
		
		session.close();
		
	}

}
