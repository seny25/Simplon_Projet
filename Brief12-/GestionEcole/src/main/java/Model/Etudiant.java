package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Etudiant implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nomEtudiant")
	private String nomEtudiant;
	@Column(name="prenomEtudiant")
	private String prenomEtudiant;
	@Column(name="adresse")
	private String adresse;
	@Column(name="mail")
	private String mail;
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nomEtudiant, String prenomEtudiant, String adresse, String mail) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant= prenomEtudiant;
		this.adresse = adresse;
		this.mail = mail;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
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

}
