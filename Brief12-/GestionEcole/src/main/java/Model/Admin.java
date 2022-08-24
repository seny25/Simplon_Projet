package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Administratur")
public class Admin implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="nom")
	private String nom;
	@Column(name="mail")
	private String mail;
	@Column(name="password")
	private String  password;

	
	public Admin() {
		// TODO Auto-generated constructor stub
	}


	public Admin(String nom, String mail, String password) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.password = password;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
