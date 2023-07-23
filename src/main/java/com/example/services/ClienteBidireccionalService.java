package com.example.services;


import com.example.entities.ClienteBidireccional;
import com.example.util.HibernateUtil;
import jakarta.transaction.Transactional;
import org.hibernate.Session;

public class ClienteBidireccionalService {

    private Session session;

    @Transactional
    public void createClienteBidireccional(ClienteBidireccional cliente) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
