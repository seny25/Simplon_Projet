package com.example.demo.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
private Long id;
   
	@Column(name="nom",length=20)
	
private String nom;
	@Column(name="prenom",length=30)
	
private String prenom;
	@Column(name="adresse",length=40)
private String adresse;
	
	@Column(name="mail",length=30)
private String mail;
	@Column(name="telephone",length=30)
private String tel;
	@Column(name="datenaissance",length=20)
private Date dateNaissance;

public Employee() {}

public Employee(String nom, String prenom, String adresse, String mail, String tel, Date dateNaissance) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.mail = mail;
	this.tel = tel;
	this.dateNaissance = dateNaissance;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public Date getDateNaissance() {
	return dateNaissance;
}

public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}




}
