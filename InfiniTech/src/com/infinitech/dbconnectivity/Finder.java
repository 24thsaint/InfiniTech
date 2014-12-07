/*
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 *  |      CENTRAL PHILIPPINE UNIVERSITY                   |
 *  |      Bachelor of Science in Software Engineering     |
 *  |      Jaro, Iloilo City, Philippines                  |
 *  |                                                      |
 *  |          This program is written by Rave, ©2014.     |
 *  |          You are free to use and distribute this.    |
 *  |          Reach me at: admin@blackout.biz.tm          |
 *  |                                                      |
 *  |               ~~~"CODE the FUTURE"~~~                |
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 */
package com.infinitech.dbconnectivity;

import com.infinitech.interfaces.SearchBehavior;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class Finder<T> implements SearchBehavior<T> {
    
    private String className;

    public Finder(String className) {
        this.className = className;
    }

    @Override
    public List<T> findAll() {        
        EntityManager em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o");
        return (List<T>) q.getResultList();
    }

    @Override
    public T findRecordById(Long id) {        
        EntityManager em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o WHERE id LIKE :id");
        q.setParameter("id", id);        
        return (T) q.getSingleResult();
    }

    @Override
    public T findRecordByField(String field, String key) {           
        EntityManager em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o WHERE " + field + " LIKE :key");
        q.setParameter("key", "%" + key + "%");
        return (T) q.getSingleResult();
    }
        
    @Override
    public List<T> findAllRecordsByField(String field, String key) {   
        EntityManager em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o WHERE " + field + " LIKE :key");
        q.setParameter("key", "%" + key + "%");
        return (List<T>) q.getResultList();
    }

}
