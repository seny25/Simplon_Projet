package Main;

import java.util.Scanner;

import Classe.Categories1;
import Classe.Categories1;
import Classe.Conexion;
import Classe.Produits;
import Classe.Unite;
import Dao_pakage.Daocategorie;
import Dao_pakage.Daoproduits;
import Dao_pakage.Daounite;

import java.sql.*;

public class Test {
	
	public static Produits produits;
	public static Categories1 categorie;
	public static Unite unite;
	public static Scanner scan = new Scanner(System.in);
	                //;;;;;;;;;;;;;;;;;;;;;;PRODUITS;;;;;;;;;;;;;;;;;;;;;
	public static void ajouter_produit(Produits produits) {
		
		
		System.out.println(" ajouter les données suivants");
		System.out.println("id_produit");
		produits.setId_produit( scan.nextInt());
		System.out.println(" nom");
		produits.setNom(scan.next());
		System.out.println("code");
		produits.setCode(scan.nextInt());
		System.out.println(" ...................quantite.....................");
		produits.setQtestock(scan.nextInt());
		System.out.println("................le prix unitaire...................");
		produits.setPrix_unitaire(scan.nextDouble());
		System.out.println("..............l'id du categorie.................");
		produits.setId_categorie(scan.nextInt());
		System.out.println("l'id du unite");
		produits.setId_unite(scan.nextInt());
		System.out.println(" données bien ajouter1");
		
		
		
	}
	public static void Supprimer_Produits(Produits Produit) {
		System.out.println(" supprimer");
		System.out.println("prendre l'id u produit");
		produits.setId_produit(scan.nextInt());
		System.out.println("???");
		
		
	}
	
	public static void Modifier_Produits(Produits Produit) {
		System.out.println("modifier les données");
		System.out.println("prendre l'id");
		produits.setId_produit(scan.nextInt());
		System.out.println("le nom du produit");
		produits.setNom(scan.next());
		System.out.println("code du produit");
		produits.setCode(scan.nextInt());
		System.out.println("quantité du produit");
		produits.setQtestock(scan.nextInt());
		System.out.println("le prix du produit");
		produits.setPrix_unitaire(scan.nextDouble());
		System.out.println("Entrer l'id du catégorie");
		produits.setId_unite(scan.nextInt());
		System.out.println("");
		
	}
	
	
	public static int lister(Produits produits) {
		int choixlist;
		System.out.println("...........................");
		System.out.println("lister");
		System.out.println("choix 1");
		System.out.println("choix 2");
		
		System.out.println("...........................");
		
		do {
			choixlist=scan.nextInt();
		} while (choixlist !=1 && choixlist !=2);
		
		return choixlist;
		
	}
	//public static int Listercategorie(Produits produits) {
		
	public static int  listecategorie_produits() {
		System.out.println("lister les categorie de produits");
		
		System.out.println("choisir ta categorie");
		int cate=scan.nextInt();
		System.out.println("");
		return cate;
	}
	
	
	
// /////////////////              categorie//////////////////////////////
	
	
	
	public static void ajouter_categorie(Categories1 cate) {
		System.out.println("ajouter les informations suivants");
		System.out.println("donnez l'id du categori");
		cate.setId_categorie(scan.nextInt());
		System.out.println("donnez le nom du categorie de produits");
		cate.setNom_categorie(scan.next());
		System.out.println("........................................");
	}
	
	public static void supprimer_categorie(Categories1 cate ) {
		System.out.println(".......................supprimer....................");
		System.out.println("choisir l;id du categorie");
		cate.setId_categorie(scan.nextInt());
		System.out.println("supprimer le nom");
		cate.setNom_categorie(scan.next());
		System.out.println(".....................................");
	}
	
	public static void modifier_categorie(Categories1 cate) {
		System.out.println(".................modifier......................");
		System.out.println("modifier seulement l'id du categorie");
		cate.setId_categorie(scan.nextInt());
		
		System.out.println("selectionnez le nom du categorie pour pouvoir modifiier");
		cate.setNom_categorie(scan.next());
		
		System.out.println("....................................");
	}
	//............................unite....................................
	public static void ajouter_unite( Unite unit) {
		System.out.println("ajouter les données");
		System.out.println("l'id du unite");
		unit.setId_unite(scan.nextInt());
		System.out.println("Entrer le nom");
		unit.setNom(scan.next());
		
		System.out.println("................................");
	}
	
	public static void supprimer_unite(Unite unit) {
		System.out.println(" ..................supprimer...............");
		System.out.println("id du unite");
		unit.setId_unite(scan.nextInt());
		System.out.println(".......................................");
		
	}
	
	public static void modifier_unite( Unite unit) {
		System.out.println("..................modifier...............");
		System.out.println("slectionnez l'id du unite");
		unit.setId_unite(scan.nextInt());
		System.out.println("ajoute le nouvelles donnees");
		System.out.println("entrer l'id");
		unit.setId_unite(scan.nextInt());
		System.out.println("entrer le nom");
		unit.setNom(scan.next());
		System.out.println("...................................");
	}
	     //lister produits
	

	public static void Ajouter_par_Categories(Categories1 cate) {
		System.out.println("+....................Ajouter-les-donner-suivent..........................+");
		System.out.println(" ........................id_Categories..........................");
	  cate.setId_categorie(scan.nextInt());
		System.out.println(" ..........................nom....................... ");
		cate.setNom_categorie(scan.next());
		System.out.println("+.............................................+");
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws SQLException {
  //Scanner scan=new Scanner(System.in);
	
	System.out.println("....................Salut.............................");
	int choixT,choix;
	Conexion con=new Conexion();
		
		Daoproduits Drpro=new Daoproduits();
		Daocategorie Dcate=new Daocategorie();
		Daounite Dunit= new  Daounite();
		do {
			
			System.out.println("selectionnez une table");
			System.out.println("t 1 produits");
			System.out.println("t 2 categories");
			System.out.println("t 3 unite");
			System.out.println("sortir du programme");
			do {
				
				choixT=scan.nextInt();
				if (choixT==0) {
					System.out.println(" Merci de bien de passer");
					return;
				}
			} while (choixT < 0 || choixT > 3);
			
			do {

				System.out.println("+.....................MENU..............+");
				System.out.println("t 1 - Ajouter");
				System.out.println("t 2 - Supprimer ");
				System.out.println("t 3 - Modifier ");
				System.out.println("t 4 - lister ");
				System.out.println("t-1 - Reteurne ");
				System.out.println("t 0 - Quitter le programme");
				System.out.println("+..........................................+");
				
				do {
					choix = scan.nextInt();
				} while (choix < -1 || choix > 4);
				
				produits =new Produits();
				categorie= new Categories1() ;
				unite=new Unite();
				
				if(choixT == 1) {
					
					switch (choix) {
					
					case 1 :
						ajouter_produit(produits);
						Drpro.ajouter(produits);
						break;
						
					case 2:
						Supprimer_Produits(produits);
						Drpro.supprimer(produits);
						break;
						
					case 3:
					      Modifier_Produits(produits);
					      Drpro.modifier(produits);
					      break;
					case 4:
					    lister(produits) ;
					 Drpro.lister(produits);
					  break;
					}
				}else if (choixT == 2) {
					switch (choix) {
					case 1:
						ajouter_categorie(categorie);
						Dcate.ajouter(categorie);
						break;
						
					case 2:
						supprimer_categorie(categorie);
						Dcate.supprimer(categorie);
						break;
					case 3:
						modifier_categorie(categorie);
						Dcate.modifier(categorie);
						break;
					case 4:
						ajouter_categorie(categorie);
						Dcate.lister(categorie);
					}
				}else if (choixT == 3) {
					switch (choix) {
					case 1:
						ajouter_unite(unite);
						Dunit.ajouter(unite);
						break;
						
					case 2:
						supprimer_unite(unite);
						Dunit.supprimer(unite);
						break;
						
						
					case 3:
						modifier_unite(unite);
						Dunit.modifier(unite);
						break;
						
						
					case 4:
						
					}
					
					
				}
				
			} while (choix != -1 && choix != 0 && choixT != 0);
					
			
		} while (choix != 0);
		
		
		con.connect().close();
		
		
		
		System.out.println("................................");	
		
	}
	}
		
		

