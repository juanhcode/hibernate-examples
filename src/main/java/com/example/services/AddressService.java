package com.example.services;

import com.example.entities.Address;
import com.example.entities.Cliente;
import com.example.util.HibernateUtil;
import jakarta.transaction.Transactional;
import org.hibernate.Session;


public class AddressService {
    private Session session;

    public void createAddress(Address address) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(address);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
