package com.clas;

public class Categories {
    private String nom;

    public Categories(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
