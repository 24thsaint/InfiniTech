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

import javax.persistence.*;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class Model {

    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Engineering_Record_SystemPU");
    private static EntityManager em;

    public static EntityManagerFactory getEMF() {
        return EMF;
    }

    protected static EntityManager getEntityManager() {
        if (em == null) {
            em = EMF.createEntityManager();
        }
        return em;
    }

    protected static Query createQuery(String query) {
        return getEntityManager().createQuery(query);
    }

    public void save() {
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(this);
        em.getTransaction().commit();
        em.close();
    }

    public void delete() {
        em = getEntityManager();
        em.getTransaction().begin();
        em.remove(this);
        em.getTransaction().commit();
        em.close();
    }
    
    public void update() {
        em = getEntityManager();
        em.getTransaction().begin();
        em.merge(this);
        em.getTransaction().commit();
        em.close();
    }
}