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

    protected static EntityManagerFactory getEMF() {
        return EMF;
    }

    protected static EntityManager getEntityManager() {        
        return EMF.createEntityManager();
    }

    protected static Query createQuery(String query) {
        em = getEntityManager();
        return em.createQuery(query);
    }

    public void save() {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(this);                        
            em.getTransaction().commit();
        } finally {
            em.close();
        }

    }

    public void update() {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(this);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
