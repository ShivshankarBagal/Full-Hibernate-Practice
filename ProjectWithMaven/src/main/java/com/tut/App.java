package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.imageio.IIOException;
import javax.imageio.stream.FileImageInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started" );
        
     
       
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        // we can write in one line also
        //  SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        
        
        //creating student object
        
        Student st=new Student();  
       // st.setId(102); // we not need to give id because we made it as auto increment
        st.setname("nayanTara");
        st.setCity("AhamadNagar");
        
        
        //creating Address object
        Address ad=new Address();
        
        ad.setStreet("street4");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddDate(new Date());
        ad.setNotSave(100);
        
        
        //Reading image
        
//        FileInputStream file=new FileInputStream("src/main/java/note.png");
//        byte[] data=new byte[file.available()];
//        ad.setImg(data);
//       // it is not open in mySQL
        
        Session session=factory.openSession();
         
       Transaction tx= session.beginTransaction();
       
       session.save(st);
       session.save(ad);  
       tx.commit();
        
        
        
        session.close();
        //System.out.println(st);
        
    }
}
