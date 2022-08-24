package Dao;

import java.util.List;



import Model.Cours;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CoursImpl implements InterfaceDao<Cours, Long>{
	EntityManagerFactory ETM=Persistence.createEntityManagerFactory("Gestion_Ecole");

	@Override
	public void save(Cours t) {
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
	public Cours show(Long id) {
		
		EntityManager entityManager=ETM.createEntityManager();
		return entityManager.find(Cours.class,id);
	}

	@Override
	public void delete(Long id) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(em.find(Cours.class, id));
		et.commit();
		System.out.println("le cours avec l'id"+id+ "a ete bien supprimer");
		
	}

	@Override
	public void update(Long id) {
		EntityManager em=ETM.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(id);
		
				
	}

	@Override
	public List<Cours> find_ALL() {
		
		EntityManager em=ETM.createEntityManager();
		Query query=em.createQuery("select cours from Cours cours");
		
		return query.getResultList();
	}

}
