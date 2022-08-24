package Classe;

public class Unite {

private int id_unite;
private String nom;
	
	public Unite() {
		
		
	}
	
	
	
public Unite(int id_unite, String nom) {
		super();
		this.id_unite = id_unite;
		this.nom = nom;
	}



public int getId_unite() {
	return id_unite;
}



public void setId_unite(int id_unite) {
	this.id_unite = id_unite;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



@Override
public String toString() {
	return "Unite [id_unite=" + id_unite + ", nom=" + nom + "]";
}





}
