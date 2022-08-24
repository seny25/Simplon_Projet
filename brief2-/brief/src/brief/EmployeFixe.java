package brief;
import java.util.Date;

public class EmployeFixe extends Employe{
private double salaireFixe;


//CONSTRUEUR 
public  EmployeFixe() {
	
}


public EmployeFixe(String nom, String prenom, String date, double salaireFixe) {
	super(nom, prenom, date);
	this.salaireFixe = salaireFixe;
}



public double getSalaireFixe() {
	return salaireFixe;
}



public void setSalaireFixe(double salaireFixe) {
	this.salaireFixe = salaireFixe;
}



@Override
public double calcul_salaire() {
	return salaireFixe;
}



@Override
public String toString() {
	return "EmployeFixe [salaireFixe=" +this.calcul_salaire()  + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + "]";
}












	
	
}
