package model;

import java.sql.Date;
import dao.DaoEmploye;

public class Test {

    
    public static void main(String[] args) {
    	
    	DaoEmploye daoemploye = new DaoEmploye();
    	
    	/*daoadministateur.save(administrateurs [0] );
    	daoadministateur.save(administrateurs [1]);
    	*/
		Employe employes[] = new Employe[3];
		employes[2] = new Employe("Gertrude","BV","gertrude@gmail.com","+212626601350",10000.0,"avenue des fars",
				new Date(12/06/2022),"En poste","DRH");
		
		daoemploye.save(employes[2]);
		/*
		employes[1] = new Employe("Soubapé","BV","nawan@gmail.com","+212626601350",20000.0,"bayti1 Imm 15 Hay Mohammedi",
				new Date(12/06/2022),"En poste","Cadre supérieur");
		employes[2] = new Employe("Soubapé","BV","nawan@gmail.com","+212626601350",20000.0,"bayti1 Imm 15 Hay Mohammedi",
				new Date(12/06/2022),"En poste","Cadre supérieur");
		daoemploye.save(employes[0]);
		daoemploye.save(employes[1]);
		daoemploye.save(employes[2]);
		*/
    	
    	//suppression des enregistrements dans la base de données
    	/*daoadministateur.delete(1L);
    	daoemploye.delete(1L);
    	*/
	}
    
    }