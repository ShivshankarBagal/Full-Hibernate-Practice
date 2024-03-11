package com.oneToManyMapping;

import java.util.ArrayList;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//ONeToMany
public class MappindMain {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		

		
		Question1 q1=new Question1();
		q1.setQuestion1Id(1212);
		q1.setQuestion1("What is Java?");
		
		
		Answer1 ans1=new Answer1();
		ans1.setAnsId(100);
		ans1.setAnswer("Java is programming language");
		ans1.setQuestion1(q1);
		
		Answer1 ans2=new Answer1();
		ans2.setAnsId(101);
		ans2.setAnswer("Java is east to learn");
		ans2.setQuestion1(q1);
		
		Answer1 ans3=new Answer1();
		ans3.setAnsId(102);
		ans3.setAnswer("Java has different typwe of frameworks");
		ans3.setQuestion1(q1);
		
		
		List<Answer1> list=new ArrayList<Answer1>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		// passing more answers to one question
		q1.setAnswer1s(list);	
		
		//session
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
    	session.save(q1);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		tx.commit();
		
		
		//fetching data
		
		
		Question1 question1=(Question1)session.get(Question1.class, 1212);
		
		System.out.println(question1.getQuestion1());
		
		for(Answer1 a:question1.getAnswer1s()) {
			System.out.println(a.getAnswer());
		}
		
		
		
		
		factory.close();
		session.close();
		
	}

}
