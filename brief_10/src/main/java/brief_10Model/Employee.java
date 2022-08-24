package brief_10Model;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import javax.persistence.Column;

import jakarta.persistence.Id;


@Entity
@Table(name="Employee")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Employee() {}
	@Id
	
	private int id;
	
	
	private String nom;
	
	
	private String prenom;
	
	
	private String mail;
	
	
	private String adresse;
	
	
	
	private Date DateEmbauche;
	
	
	private String HeurTravail;
	
	
	private String HeurDes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateEmbauche() {
		return DateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		DateEmbauche = dateEmbauche;
	}

	public String getHeurTravail() {
		return HeurTravail;
	}

	public void setHeurTravail(String heurTravail) {
		HeurTravail = heurTravail;
	}

	public String getHeurDes() {
		return HeurDes;
	}

	public void setHeurDes(String heurDes) {
		HeurDes = heurDes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", DateEmbauche=" + DateEmbauche + ", HeurTravail=" + HeurTravail + ", HeurDes=" + HeurDes + "]";
	}
	
	
}
