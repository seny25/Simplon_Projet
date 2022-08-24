package Dao;

import java.util.List;

import Model.Etudiant;
import Model.Prof;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ProfImpl implements InterfaceDao<Prof, Long>{
 EntityManagerFactory ETM=Persistence.createEntityManagerFactory("Gestion_Ecole");
	@Override
	public void save(Prof t) {
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
	public Prof show(Long id) {
	EntityManager em=ETM.createEntityManager();
	
		return em.find(Prof.class, id);
	}
//suppression
	@Override
	public void delete(Long id) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(em.find(Prof.class, id));
		
		et.commit();
		
	}
//modification
	@Override
	public void update(Long id) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(id);
		
	}
//lister
	@Override
	public List<Prof> find_ALL() {
		EntityManager entityManager=ETM.createEntityManager();
		Query query=entityManager.createQuery("select prof from Prof prof");
		return query.getResultList();
	}

}
