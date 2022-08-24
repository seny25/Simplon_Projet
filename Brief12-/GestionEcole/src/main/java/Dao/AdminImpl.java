package Dao;

import java.util.List;

import Model.Admin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class AdminImpl implements InterfaceDao<Admin, Long>{
EntityManagerFactory ETM=Persistence.createEntityManagerFactory("Gestion_Ecole");
	@Override
	public void save(Admin t) {
		
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 if (t.getNom()==null){
			 //persist - Rendre une instance gérée et persistante.
			 em.persist(t);
	        }else {
	        	em.merge(t);
	        }

	        et.begin();
	        et.commit();
		
	}

	@Override
	public Admin show(Long id) {
		
		EntityManager EM=ETM.createEntityManager();
		return EM.find(Admin.class, id);
	}

	@Override
	public void delete(Long id) {
		EntityManager EM = ETM.createEntityManager();
        EntityTransaction tx = EM.getTransaction();
        tx.begin();
        EM.remove(EM.find(Admin.class,id));
        tx.commit();
        System.out.println("L'administarteur ayant l'id "+id +" a été supprimé");
		
	}

	@Override
	public void update(Long id) {
		EntityManager entityManager = ETM.createEntityManager();
		 EntityTransaction tx = entityManager.getTransaction();
		 tx.begin();
		entityManager.merge(id);
		
	}

	@Override
	public List<Admin> find_ALL() {
		EntityManager entityManager = ETM.createEntityManager();
		Query query=entityManager.createQuery("select admin from Administr admin");
	
	
	return query.getResultList() ;
	}

		
	}

	