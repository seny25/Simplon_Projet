package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class Admin {
	@Id
	@	GeneratedValue
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="mail")
	private String mail;
	@Column(name="password")
	private int password;
	
	public Admin() {}

	public Admin( String nom, String prenom ,String mail, int password) {
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.mail = mail;
		this.password = password;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	
	
	

}
