package com.mapUsingXML;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		//1st customer
		
		Orders o=new Orders();
		o.setOrderName("KeyBoard");
		
		Orders o1=new Orders();
		o1.setOrderName("Laptop");
		
		List<Orders> list=new ArrayList<Orders>();
		list.add(o);
		list.add(o1);
		
		Customer c=new Customer();
		c.setcName("Mahesh Dhage");
		c.setOrders(list);
		 
		//2nd customer
		
		Orders order3=new Orders();
		order3.setOrderName("Induction");
		
		Orders order4=new Orders();
		order4.setOrderName("Mobile");
		
		Orders order5=new Orders();
		order5.setOrderName("smart watch");
		
		List<Orders> list1=new ArrayList<Orders>();
		list1.add(order3);
		list1.add(order4);
		list1.add(order5);
		
		Customer c1=new Customer();
		c1.setcName("Narayan Murti");
		c1.setOrders(list1);
		
		
		session.save(c);
		session.save(c1);


		tx.commit();
		session.close();
		factory.close();
		

	}

}
