package Model;

import Dao.AdminImpl;
import Dao.EtudiantImpl;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
				AdminImpl adminImpl=new AdminImpl();
				EtudiantImpl etudiantimp=new EtudiantImpl();
		
		Admin ad=new Admin("seny","seny1.balde@gmail,com","");
		adminImpl.save(ad);
		
	
		
	}
}
