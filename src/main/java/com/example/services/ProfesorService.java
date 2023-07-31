package com.example.services;


import com.example.entities.Profesor;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

public class ProfesorService {
    private Session session;

    public void createProfesor(Profesor profesor) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(profesor);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
