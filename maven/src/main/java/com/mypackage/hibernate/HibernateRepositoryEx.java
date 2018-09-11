package com.mypackage.hibernate;

import com.mypackage.models.Registration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateRepositoryEx {

    public void doNothing(Registration registration){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
        session.save(registration);
        transaction.commit();

    }


    public void getData(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
//        Query query= session.createQuery("from Login");
//        return;query.();


    }
}
