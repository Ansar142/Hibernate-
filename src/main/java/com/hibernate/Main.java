package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        /*

        Student s1 = new Student().setName("Asad").setRollNo(15).setMarks(90);
        Configuration cf = new Configuration();
        cf.addAnnotatedClass(com.hibernate.Student.class);
        cf.configure("hibernate.xml");//by default its "hibernate.cfg.xml"
        SessionFactory sf = cf.buildSessionFactory();
        Session s = sf.openSession();
        Transaction transaction = s.beginTransaction();
        s.persist(s1);
        transaction.commit();
        System.out.println(s1);
*/


        //Student s2 = new Student().setName("Saad").setRollNo(1).setMarks(100) ;
        Configuration cf = new Configuration();
        cf.addAnnotatedClass(com.hibernate.Student.class);
        cf.configure("hibernate.xml");//by default its "hibernate.cfg.xml"
        SessionFactory sf = cf.buildSessionFactory();
        Session s = sf.openSession();
        Student s2 = s.get(Student.class,11);
        Transaction transaction = s.beginTransaction();
        //s.merge(s2);
        s.remove(s2);
        transaction.commit();
        s.close();
        sf.close();
        System.out.println(s2);


    }
}
