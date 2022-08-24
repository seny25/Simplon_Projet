package PackaDAO;


import java.util.List;

import brief_10Model.Employee;

public interface InterEmploye {
	//enregistrer un employee
	public void save(Employee E);
	//retourner la liste des employees
	public List <Employee> findAll();
	//permette de retourner les employer dont la designation est ep
	public List <Employee> findByDesignation(String ep);
	//chercher un employee en connaissant son ID
	public void findByID(Long id);
	//mettre a jour un emplouee
	public void update(Employee E);
	//suprimer un employer a travers son ID
	public void deleteById( Long empID);
	
		
	

}
