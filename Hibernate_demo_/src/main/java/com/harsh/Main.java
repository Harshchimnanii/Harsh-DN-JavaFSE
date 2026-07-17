package com.harsh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        harshchimnani Servants = new harshchimnani();
        Servants.setId("6");
        Servants.setName("Diya");
        Servants.setMarks(100);
//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.harsh.harshchimnani.class);
//        config.configure("hibernate.cfg.xml");
//        SessionFactory factory = config.buildSessionFactory();
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.harsh.harshchimnani.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();

//        harshchimnani a1 = session.byId(harshchimnani.class).getReference(1); // lazy fetching

        harshchimnani a1 = session.find(harshchimnani.class,1);//eager fetching
        System.out.println(a1);

//        session.close();
//        factory.close();
//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
        session.persist(Servants);
//        transaction.commit();

        session.close();
        factory.close();

        System.out.println("Data inserted successfully!");
    }
}