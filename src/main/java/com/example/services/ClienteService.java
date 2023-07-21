package com.example.services;

import com.example.entities.Cliente;
import com.example.util.HibernateUtil;
import jakarta.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ClienteService {


    private Session session;

    @Transactional
    public void createCliente(Cliente cliente) {
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

    public Cliente getClienteById(Long id) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Cliente cliente = session.get(Cliente.class, id);
            session.getTransaction().commit();
            return cliente;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    public boolean updateCliente(Cliente cliente) {
        boolean exito = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(cliente);
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

    public boolean deleteCliente(Cliente cliente) {
        boolean exito = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(cliente);
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


    public boolean saveOrUpdateCliente(Cliente cliente) {
        boolean exito = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(cliente);
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