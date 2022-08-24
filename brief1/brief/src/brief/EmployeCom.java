package brief;


import java.util.Scanner;

public class EmployeCom extends Employe{
private int vente;
private double commi;
private double salaire;
private double salaireFixe;

Scanner clavier=new Scanner(System.in);

public EmployeCom() {
	
}



public EmployeCom(String nom, String prenom, String date, int vente, double commi, double salaire) {
	super(nom, prenom, date);
	this.vente = vente;
	this.commi = commi;
	this.salaire = salaire;
	
}













public EmployeCom(String nom, String prenom, String date) {
	// TODO Auto-generated constructor stub
	super(nom, prenom, date);
}



public int getVente() {
	return vente;
}



public void setVente(int vente) {
	this.vente = vente;
}



public double getCommi() {
	return commi;
}



public void setCommi(double commi) {
	this.commi = commi;
}



public double getsalaire() {
	return salaire;
}

public void  setsalaire(double salaire) {
	this.salaire=salaire;
}




@Override
public double calcul_salaire() {
	return salaire=salaireFixe+(vente*commi);
	
}


@Override
public String toString() {
	return String.format("EmployeCom vente= " + this.vente + ", commi=" + this.commi + ", salaire=" + this.calcul_salaire() + ", nom=" + this.nom + ", prenom="
			+ this.prenom + ", date=" + this.date); 
}



	} 




