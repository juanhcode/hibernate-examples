package com.example.services;

import com.example.entities.Autor;
import com.example.entities.Cliente;
import com.example.entities.Profesor;
import com.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class AutorService {

    private Session session;

    public void createAutor(Autor autor) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(autor);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public boolean updateAutor(Autor autor) {
        boolean exito = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(autor);
            session.getTransaction().commit();
            exito = true;
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return exito;
    }
}
