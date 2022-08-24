package dao;

import dao.DaoEmploye;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import model.Employe;
import jakarta.persistence.*;
public class DaoEmploye implements IDao<Employe> {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("connect");
	
	@Override
    public void save(Employe employe){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        if (employe.getId()==null){
            em.persist(employe);
        }else {
            em.merge(employe);
        }

        tx.begin();
        tx.commit();
    }

	@Override
    public Employe show(Long id){
        EntityManager em = emf.createEntityManager();
        return em.find(Employe.class,id);
    }

	@Override
    public void delete(Long id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(em.find(Employe.class,id));
        tx.commit();
        System.out.println("L'employé ayant l'id "+id +" a été supprimé");
    }

	
}
