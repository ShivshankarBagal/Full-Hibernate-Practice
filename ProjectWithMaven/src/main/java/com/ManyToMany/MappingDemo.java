package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		
		e1.seteId(11);
		e1.seteName("Ram");
		
		e2.seteId(21);
		e2.seteName("Shyam");
		
		
		Project p1=new Project();	
		Project p2=new Project();
		
		p1.setpId(101);
		p1.setProjectName("Library Management");
		
		p2.setpId(111);
		p2.setProjectName("School Management");
		
		
		
		List<Employee> empList=new ArrayList<Employee>();
		List<Project>proList=new ArrayList<Project>();
		
		empList.add(e1);
		empList.add(e2);
		
		proList.add(p1);
		proList.add(p2);
		
		//one employee has list of projects
		e1.setProjects(proList);
		
		//one projects has many employees
		p2.setEmps(empList);
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		
		tx.commit();
		
		
		session.close();
		factory.close();
		
		
	}

}
