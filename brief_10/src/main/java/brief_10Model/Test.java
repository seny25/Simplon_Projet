package brief_10Model;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.antlr.v4.parse.ANTLRParser.exceptionGroup_return;
import org.hibernate.internal.StaticFilterAliasGenerator;

import jakarta.persistence.TypedQuery;

public class Test {		
private static EntityManagerFactory E_M_F= Persistence
.createEntityManagerFactory("brief_10");


public static void main(String[] args) {
	E_M_F.close();
	}

public static void AddEmployee(int id, String nom,String prenom, String mail, String adresse,Date DateEmbauche, 
		String HeurTravail, String HeurDes) {
	
	EntityManager em=E_M_F.createEntityManager();
	EntityTransaction et =null;
	try {
	
		et=em.getTransaction();
		et.begin();
		Employee emp=new Employee();
		emp.setId(id);
		emp.setNom(nom);
		emp.setPrenom(prenom);
		emp.setMail(mail);
		emp.setAdresse(adresse);
		emp.setDateEmbauche(DateEmbauche);
		emp.setHeurTravail(HeurTravail);
		emp.setHeurDes(HeurDes);
		em.persist(emp);
		et.commit();
		
		
	} catch (Exception e) {
		if(et!=null) {
			et.rollback();
		}
		e.printStackTrace();
	}
	finally {
		em.close();
	}
}

}
