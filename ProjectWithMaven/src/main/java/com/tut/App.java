package com.tut;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        
     
       
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        // we can write in one line also
        //  SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        
        System.out.println(factory);
    }
}
