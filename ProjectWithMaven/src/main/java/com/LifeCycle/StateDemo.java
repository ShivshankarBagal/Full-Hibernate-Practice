package com.LifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	
	public static void main(String[] args) {
		
		
		//Transient state
		//persistent state
		//Detached state
		//Removed state
		System.out.println("Example: ");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student student=new Student();
		
		
		//creating student object
		//student.setId(id);
		student.setname("Maharana");
		student.setCity("Manipur");
		student.setCarti(new Certificate("React.Js developer", "2 months"));	
		// student: Transient state
		
		
		session.save(student);
		//student: persistent state - sessions,database
		
		
		student.setname("Nagarjun");
		//fire update query and update name field	
		
		tx.commit();
		
//		//for deleting object
//		Transaction deletetx=session.beginTransaction();
//		session.delete(student);
//		//student: removed state 
//		deletetx.commit();
		 
		
		
		session.close();
		//student: Detaches state
		
		student.setCity("Amravati");
		//not changes in DB because  in Detached state
		factory.close();
		
		
	}

}
