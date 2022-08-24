package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Cours implements Serializable {
@Id
@GeneratedValue
private Long id;
@Column(name="codecours")
private String CodeCours;
@Column(name="nomProf")
private String nomProf;
@Column(name="nomEtudiant")
private String nomEtudiant;

public Cours() {
	// TODO Auto-generated constructor stub
}


public String getNomProf() {
	return nomProf;
}


public void setNomProf(String nomProf) {
	this.nomProf = nomProf;
}


public String getNomEtudiant() {
	return nomEtudiant;
}


public void setNomEtudiant(String nomEtudiant) {
	this.nomEtudiant = nomEtudiant;
}


public Cours(String codeCours, String nomProf, String nomEtudiant) {
	super();
	CodeCours = codeCours;
	this.nomProf = nomProf;
	this.nomEtudiant = nomEtudiant;
}


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getCodeCours() {
	return CodeCours;
}

public void setCodeCours(String codeCours) {
	CodeCours = codeCours;
}


}
