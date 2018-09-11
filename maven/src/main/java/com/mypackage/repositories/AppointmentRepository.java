package com.mypackage.repositories;
import com.mypackage.dbConnection.DbConnection;
import com.mypackage.hibernate.HibernateUtil;
import com.mypackage.models.Doctor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

@Repository
public class AppointmentRepository {

    public void confirmAppointment(Doctor doctor, String userName) {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        dbConnection.confirmAppointment(connection, doctor, userName);

    }

    public List viewAppointments(String userName) {
//        DbConnection dbConnection = new DbConnection();
//        Connection connection = dbConnection.createConnection();
//        Map map = dbConnection.viewAppointments(connection, userName);
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
        Query query= session.createQuery("from Login ");
       List list=query.list();
        return query.list();



//        Criteria criteria=session.createCriteria(Login.class);
//        criteria.addRestrictions.eq("");

    }

    public void deleteAppointment(Doctor doctor, String userName) {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        Map map = dbConnection.viewAppointments(connection, userName);
        dbConnection.openAppointments(connection, map);
        dbConnection.deleteAppointment(connection, doctor, userName);
    }
}

