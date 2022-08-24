package PackaDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import brief_10Model.Employee;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

public class EmplDao implements InterEmploye{
	private EntityManager entityManager;
	//constructeur
	public void CatalogueDaoimpl() {
		//creation de l'objet Entity Manager Factory
		EntityManagerFactory EMF=(EntityManagerFactory) Persistence.createEntityManagerFactory("brief_10");
		//Creation de l'objet Entity Manager
		
	}

	public void save(Employee E) {
		//creation d'une transation
		EntityTransaction transation=entityManager.getTransaction();
		//demarrer une transation
		transation.begin();
		try {
			//Enregistrer l' employee  E dans la BD
			entityManager.persist(E);
			//valider la transation si sa marche bien
			transation.commit();
		} catch (Exception e2) {
			//annuler la transaction en cas d'exception
			transation.rollback();
			
		}
		
		
	}

	public List<Employee> findAll() {
		Query query=(Query) entityManager.createQuery("select E from Employee E");
		return query.getResultList();
	}
	// retourner la liste des  employees dont la designation est ep
	public List<Employee> findByDesignation(String ep) {
	Query query=(Query) entityManager.createQuery("select E from Employee E where E.designation like:nom");
	query.setParameter("nom", "%"+ep+ "%");
		return query.getResultList();
	}
	
	//chercher un employee en connaissant son ID
	public void findByID(Long id) {
		Employee E=entityManager.find(Employee.class, id);
		//return E;
		
	}

	public void update(Employee E) {
		entityManager.merge(E);
		
	}

	public void deleteById(Long id) {
	Employee E=entityManager.find(Employee.class, id);
	entityManager.remove(E);
		
	}

	

}
