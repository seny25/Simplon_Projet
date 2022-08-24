package brief;

import java.util.Scanner;

public class EmployeHoraire extends Employe{
	Scanner clavier=new Scanner(System.in);
	        int TH;
	        int HP;
	        int salairnet;
            double salaire;
	  
	       	
//	        public double getSalaire() {
//	return salaire;
//}
//
//public void setSalaire(double salaire) {
//	this.salaire = salaire;
//}

			public EmployeHoraire() {
				
			}
	        
			public EmployeHoraire(String nom, String prenom, String date, int tH, int hP, double salaire) {
				super(nom, prenom, date);
				this.TH = tH;
				this.HP = hP;
				
				this.salaire=salaire;
			}
			

			public int getTH() {
				return TH;
			}

			public void setTH(int tH) {
				TH = tH;
			}

			public int getHP() {
				return HP;
			}

			public void setHP(int hP) {
				HP = hP;
			}

			

			@Override
			public double calcul_salaire() {
				return salaire=(34*190);
			}

			@Override
			public String toString() {
				return "EmployeHoraire [TH=" + TH + ", HP=" + HP + ", salaire=" +this.calcul_salaire() + ", nom=" + nom + ", prenom="
						+ prenom + ", date=" + date + "]";
			}
}
