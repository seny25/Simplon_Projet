package Classe;


import java.sql.*;
public class Produits {
private int id_produit;
private String nom;
private int code ;
private int qtestock;
private double  prix_unitaire;
private int id_categorie;
private int id_unite;
//private int id_unite;
public Produits() {
	
}
public Produits(int id_produit, String nom, int code, int qtestock, double prix_unitaire, int id_categorie,int id_unite) {
	super();
	this.id_produit = id_produit;
	this.nom = nom;
	this.code = code;
	this.qtestock = qtestock;
	this.prix_unitaire = prix_unitaire;
	this.id_categorie = id_categorie;
	this.id_unite=id_unite;
	//this.id_unite = id_unite;
}
public int getId_unite() {
	return id_unite;
}
public void setId_unite(int id_unite) {
	this.id_unite = id_unite;
}
public int getId_produit() {
	return id_produit;
}
public void setId_produit(int id_produit) {
	this.id_produit = id_produit;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public int getQtestock() {
	return qtestock;
}
public void setQtestock(int qtestock) {
	this.qtestock = qtestock;
}
public double getPrix_unitaire() {
	return prix_unitaire;
}
public void setPrix_unitaire(double prix_unitaire) {
	this.prix_unitaire = prix_unitaire;
}
public int getId_categorie() {
	return id_categorie;
}
public void setId_categorie(int id_categorie) {
	this.id_categorie = id_categorie;
}
@Override
public String toString() {
	return "Produits [id_produit=" + id_produit + ", nom=" + nom + ", code=" + code + ", qtestock=" + qtestock
			+ ", prix_unitaire=" + prix_unitaire + ", id_categorie=" + id_categorie + ", id_unite=" + id_unite + "]";
}


	
	
}
