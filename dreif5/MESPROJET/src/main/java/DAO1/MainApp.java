package DAO1;
import java.sql.*;
import java.util.Scanner;
public class MainApp {

	
	
	public static Scanner scan = new Scanner(System.in);
	public static Candidats candidats;
	
	public static void ajouter () {
		System.out.println(" -------------Ajouter les donner suivent------------");
		System.out.println(" ------------------------Nom------------------------");
		candidats.setNom(scan.next());
		System.out.println(" ----------------------Prenom-----------------------");
		candidats.setPrenom(scan.next());
		System.out.println(" -----------------------Mail------------------------");
		candidats.setMail(scan.next());
		System.out.println(" ----------------------Adresse----------------------");
		candidats.setAdresse(scan.next());
		System.out.println(" -----------------------Ville-----------------------");
		candidats.setVille(scan.next());
		System.out.println(" -----------------------Pays------------------------");
		candidats.setPays(scan.next());
	    System.out.println(" ---------------------------------------------------");
	}
	
	public static void miss_jour() {
		System.out.println(" --------------------Misse a jour-------------------");
		System.out.println(" ----------Choisir Nom de candidat----------");
		
		System.out.println(" -------------Ajouter les nouveau donner------------");
	
		candidats.setNom(scan.next());
		System.out.println(" ----------------------Prenom-----------------------");
		candidats.setPrenom(scan.next());
		System.out.println(" -----------------------Mail------------------------");
		candidats.setMail(scan.next());
		System.out.println(" ----------------------Adresse----------------------");
		candidats.setAdresse(scan.next());
		System.out.println(" -----------------------Ville-----------------------");
		candidats.setVille(scan.next());
		System.out.println(" -----------------------Pays------------------------");
		candidats.setPays(scan.next());
		System.out.println(" ---------------------------------------------------");
		
	}
	
	public static void Supprimer() {
		System.out.println(" ---------------------Supprimer---------------------");
		System.out.println(" ----------Choisir Nom----------");
		
		System.out.println(" ---------------------------------------------------");
	}
	
	public static void main(String[] args)  {
		
		
		int choi;
		CandidatsDao use= new CandidatsDao();
		
		//Db con = new Db();
		do {
			
			//System.out.print("\f");
			
			System.out.println(" ----------MENU---------");
			System.out.println("|\t1-Ajouter\t|");
			System.out.println("|\t2-Afficher\t|");
			System.out.println("|\t3-Mettre a jour\t|");
			System.out.println("|\t4-Supprimer\t|");
			System.out.println("|\t0-Quitter\t|");
			System.out.println(" -----------------------");
			
			do {
				choi = scan.nextInt();
			}while(choi < 0 && choi > 4);
			
			candidats = new Candidats();
			
			switch(choi) {
				case 1 : ajouter();
					use.Create(candidats);
				break;
				case 2 : 
					use.Read(candidats);
				break;
				case 3 : 
					miss_jour();
					use.Update(candidats);
				break;
				case 4 : 
					Supprimer();
					use.Delete(candidats);
				break;
				case 0 : System.out.println("-----------------------Merci-----------------------");
						
				break;
			}
		}while(choi != 0);
		
		
	

}

}


