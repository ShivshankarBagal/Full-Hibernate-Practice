package co.cascade;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Answer;
import com.mapping.Question;

public class CascadeDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Question question=new Question();
		
		question.setQuestionId(1616);
		question.setQuestion("what is Number?");
		
		Answer answer=new Answer();
		answer.setAnsId(5466);
		answer.setAnswer("is a Integer value");
		//answer.setQuestion(question);
		
		question.setAnswer(answer);
		
		session.save(question);
		//session.save(answer); //here we use cascading 
		//hence we don't need to save answer manually
		
		tx.commit();
		
		factory.close();
		session.close();
		
	}

}
