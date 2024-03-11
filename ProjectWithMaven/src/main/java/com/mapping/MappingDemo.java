package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		
		
		
		
		
		
		Question q1=new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java?");
		
		
		Answer ans1=new Answer();
		ans1.setAnsId(100);
		ans1.setAnswer("Java is programming language");
		q1.setAnswer(ans1);
		
		
		Question q2=new Question();
		q2.setQuestionId(1313);
		q2.setQuestion("What is python?");
		
		Answer ans2=new Answer();
		ans2.setAnsId(200);
		ans2.setAnswer("python is computer language");
	
		q2.setAnswer(ans2);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		session.save(q1);
		session.save(q2);
		session.save(ans2);
		session.save(ans1);
		tx.commit();
		
		
		
		factory.close();
		session.close();
		
	}

}
