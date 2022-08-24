package DAO1;

//public class Candidats {

	
	
	
	

public class Candidats {
	private String nom,prenom,adresse,ville,pays,mail;
	
	//construteur sans parametre
	public Candidats() {
		
	}

	//constructeur avec des parametres

	public Candidats(String nom, String prenom, String adresse, String ville, String pays, String mail) {
		super();

		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.pays = pays;
		this.mail = mail;
	}



	//getters et setters
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

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Candidats [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville + ", pays="
				+ pays + ", mail=" + mail + "]";
	}




	}






