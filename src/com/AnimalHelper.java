package com;
import com.Animal1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AnimalHelper {
    EntityManagerFactory emf;
    EntityManager em;

    public AnimalHelper() {
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    public Animal1 getById(int id) {
        em.getTransaction().begin();
        Animal1 client = em.find(Animal1.class, id);
        em.getTransaction().commit();
        emf.close();
        return client;
    }

    public void add(Animal1 a) {
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
        emf.close();
    }

    public void remove(Animal1 a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
        emf.close();
    }


    public List<Animal1> getAll() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT animals FROM Animal1 animals ");
        List<Animal1> animal1s = query.getResultList();
        em.getTransaction().commit();
        emf.close();
        return animal1s;
    }

}
