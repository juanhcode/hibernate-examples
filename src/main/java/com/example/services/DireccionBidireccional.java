package com.example.services;

import com.example.entities.ClienteBidireccional;
import com.example.util.HibernateUtil;
import jakarta.transaction.Transactional;
import org.hibernate.Session;

public class DireccionBidireccional {

    private Session session;

    @Transactional
    public void createDireccionBidireccional(DireccionBidireccional direccionBidireccional) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(direccionBidireccional);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
