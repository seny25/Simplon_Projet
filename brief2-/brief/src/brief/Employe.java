package brief;




import java.util.Scanner;
import java.util.Date;

public abstract class Employe {
protected String nom,prenom;
protected String date;
protected double salaireFixe;



Scanner clavier=new Scanner(System.in);


//constructeur par defaut

 public Employe(){
	
}
//contructeur avec paramettre
 
 public Employe(String nom,String prenom,String date ) {
	 super();
	 this.nom=nom;
	 this.prenom =prenom;
	 this.date=date;
	 
 }
 



 public Employe(String nom) {
	super();
	this.nom = nom;
}
 
public void setNom(String nom) {
	this.nom = nom;
	nom=clavier.next();
}

public String getprenom() {
	return prenom;
}

public void setprenom(String prenom) {
	this.prenom=prenom;
	prenom=clavier.next();
}
public double getsalaireFixe() {
	return salaireFixe;
}

public void setsalaireFixe(double salaireFixe) {
	this.salaireFixe=salaireFixe;
}

public String getdate() {
	return date;
}
public void setdate(String date) {
	this.date=date;
}

public abstract double calcul_salaire();



}

