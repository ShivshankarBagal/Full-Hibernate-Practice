package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student std1=new Student();
		
		//std1.setId(id);
		  std1.setname("Ankit Tiwari");
		  std1.setCity("America");
		  
		  Student std2=new Student();
			
			
			  std2.setname("Ramech shaoo");
			  std2.setCity("russian");
		  
		  Certificate certificate=new Certificate();
		  certificate.setCourse("Java development");
		  certificate.setDuration("2 months");
		  
		  Certificate certificate1=new Certificate();
		  certificate1.setCourse("web development");
		  certificate1.setDuration("5 months");
		  
		  
		  std1.setCarti(certificate);
		  std2.setCarti(certificate1);
		  
		  
		  Session session=factory.openSession();
		  Transaction tx=session.beginTransaction();
		  
		  session.save(std1);
		  session.save(std2);
		  
//		  session.save(certificate);
//		  session.save(certificate1);
		  
		 tx.commit(); 
		session.close();
		factory.close();
		
		
		
	}

}
