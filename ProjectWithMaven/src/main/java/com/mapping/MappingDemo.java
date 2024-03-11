package com.mapping;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

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
		ans1.setQuestion(q1);
		q1.setAnswer(ans1);
		
		
		Question q2=new Question();
		q2.setQuestionId(1313);
		q2.setQuestion("What is python?");
		
		Answer ans2=new Answer();
		ans2.setAnsId(200);
		ans2.setAnswer("python is computer language");
		ans2.setQuestion(q2);
	
		q2.setAnswer(ans2);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		session.save(q1);
		session.save(q2);
		session.save(ans2);
		session.save(ans1);
		tx.commit();
		
		
		//fetching data
		
		
		TypedQuery query=session.createQuery("from Question q");
		
		List<Question>list=query.getResultList();
		
		Iterator<Question> itr=list.iterator();
		while(itr.hasNext()) {
			Question qu=itr.next();
			System.out.println(qu.getQuestion());
			System.out.println(qu.getAnswer().getAnswer());
		}
		
		
		
		
		factory.close();
		session.close();
		
	}

}
