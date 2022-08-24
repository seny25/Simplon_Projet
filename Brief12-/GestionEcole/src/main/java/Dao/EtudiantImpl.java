package Dao;

import java.util.List;

import Model.Etudiant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EtudiantImpl implements InterfaceDao<Etudiant, Long> {
	EntityManagerFactory ETM=Persistence.createEntityManagerFactory("Gestion_Ecole");

	@Override
	public void save(Etudiant t) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		if (t.getId()==null) {
			em.persist(t);
			
		}else {
			em.merge(t);
		}
		et.begin();
		et.commit();
	}

	@Override
	public Etudiant show(Long id) {
		EntityManager em=ETM.createEntityManager();
				
		return em.find(Etudiant.class, id);
	}

	@Override
	public void delete(Long id) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(em.find(Etudiant.class, id));
		
		et.commit();
		System.out.println("l'Etudiant avec "+id+ "a ete bien supprimer");
		
	}

	@Override
	public void update(Long id) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(id);
		
	}

	@Override
	public List<Etudiant> find_ALL() {
		EntityManager entityManager=ETM.createEntityManager();
		Query query=entityManager.createQuery("select etudiant from  Etudiant etudiant");
		
		return query.getResultList();
	}

	
	}
