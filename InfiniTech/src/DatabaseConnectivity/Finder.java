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
package DatabaseConnectivity;

import InterfaceClasses.SearchBehavior;
import Objects.Student;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class Finder<T> implements SearchBehavior<T> {

    private EntityManager em;
    private String className;

    public Finder(String className) {
        this.className = className;
    }

    @Override
    public List<T> findAll() {
        em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o");
        return (List<T>) q.getResultList();
    }

    @Override
    public T findRecordById(Long id) {
        em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o WHERE id LIKE :id");
        q.setParameter("id", id);
        return (T) q.getSingleResult();
    }

    @Override
    public T findRecordByField(String field, String key) {
        em = Model.getEntityManager();
        Query q = em.createQuery("SELECT o FROM " + this.className + " o WHERE " + field + " LIKE :key");
        q.setParameter("key", "%" + key + "%");
        return (T) q.getSingleResult();
    }

    @Override
    public int getRecordCount() {
        em = Model.getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Student> rt = cq.from(Student.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
