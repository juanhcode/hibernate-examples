package com.example.services;

import com.example.entities.Person;
import com.example.util.HibernateUtil;
import org.hibernate.Session;

public class PersonService {
    private Session session;

    public void createPerson(Person person) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
