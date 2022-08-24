package com.clas;

public class Utilisateurs {
    private String nom,prenom,nom_utilisateur;
    private int motpass;

    public Utilisateurs(String nom, String prenom, String nom_utilisateur, int motpass) {
        this.nom = nom;
        this.prenom = prenom;
        this.nom_utilisateur = nom_utilisateur;
        this.motpass = motpass;
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

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public int getMotpass() {
        return motpass;
    }

    public void setMotpass(int motpass) {
        this.motpass = motpass;
    }

    @Override
    public String toString() {
        return "Utilisateurs{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_utilisateur='" + nom_utilisateur + '\'' +
                ", motpass=" + motpass +
                '}';
    }
}
