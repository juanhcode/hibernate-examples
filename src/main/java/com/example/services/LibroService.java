package com.example.services;

import com.example.entities.Libro;
import com.example.entities.Person;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

public class LibroService {

    private Session session;

    public void createLibro(Libro libro) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(libro);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
