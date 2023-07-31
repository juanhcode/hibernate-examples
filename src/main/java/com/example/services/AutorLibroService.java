package com.example.services;

import com.example.entities.AutorLibro;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

public class AutorLibroService {

    private Session session;

    public void createAutorLibro(AutorLibro autorLibro) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(autorLibro);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
