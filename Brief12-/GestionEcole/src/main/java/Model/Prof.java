package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Prof implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nomProf")
	private String nomProf;
	@Column(name="prenomProf")
	private String prenomProf;
	@Column(name="adresse")
	private String adesse;
	@Column(name="mail")
	private String mail;
	
	public Prof() {
		// TODO Auto-generated constructor stub
	}

	public Prof(String nomProf, String prenomProf, String adesse, String mail) {
		super();
		this.nomProf = nomProf;
		this.prenomProf = prenomProf;
		this.adesse = adesse;
		this.mail = mail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomProf() {
		return nomProf;
	}

	public void setNomProf(String nomProf) {
		this.nomProf = nomProf;
	}

	public String getPrenomProf() {
		return prenomProf;
	}

	public void setPrenom(String prenomProf) {
		this.prenomProf = prenomProf;
	}

	public String getAdesse() {
		return adesse;
	}

	public void setAdesse(String adesse) {
		this.adesse = adesse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

}
