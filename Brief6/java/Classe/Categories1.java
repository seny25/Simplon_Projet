package Classe;

public class Categories1 {
private int  id_categorie;
private String nom_categorie;

public Categories1() {
	
	
}


public Categories1(int id_categorie, String nom_categorie) {
	super();
	this.id_categorie = id_categorie;
	this.nom_categorie = nom_categorie;
}


public int getId_categorie() {
	return id_categorie;
}


public void setId_categorie(int id_categorie) {
	this.id_categorie = id_categorie;
}


public String getNom_categorie() {
	return nom_categorie;
}


public void setNom_categorie(String nom_categorie) {
	this.nom_categorie = nom_categorie;
}




@Override
public String toString() {
	return "Categorie [id_categorie=" + id_categorie + ", nom_categorie=" + nom_categorie + "]";
}
}
