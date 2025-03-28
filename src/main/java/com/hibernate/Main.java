package com.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.sql.Connection;
import java.util.Arrays;

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
*/      //Student s2 = new Student().setName("Saad").setRollNo(1).setMarks(100) ;


        Insentives ins = new Insentives();
        ins.setInsId(104);
        ins.setCar("BYD");
        ins.setHouse("320");

        Insentives ins1 = new Insentives();
        ins1.setInsId(105);
        ins1.setCar("Tea");
        ins1.setHouse("20");

        Employee s2 = new Employee();
        s2.setAge(22);
        s2.setEmpId(13);
        s2.setEmpName("Anas");
        s2.setIns(Arrays.asList(ins,ins1));


        ins.setEmp(s2);
        ins1.setEmp(s2);

        Configuration cf = new Configuration().
        addAnnotatedClass(com.hibernate.Employee.class).
        addAnnotatedClass(com.hibernate.Insentives.class);

        cf.configure();//by default its "hibernate.cfg.xml"
        SessionFactory sf = cf.buildSessionFactory();
        Session s = sf.openSession();
        Transaction transaction = s.beginTransaction();

        s.persist(s2);
        s.persist(ins);
        s.persist(ins1);

        transaction.commit();
        s.close();
        sf.close();


    }
}
