package com.clas;

import java.sql.Date;

public class Taches {
    private String titre,description,status,nom_categorie;
    private String deadline;

    public Taches(String titre, String description, String status, String nom_categorie, String deadline) {
        this.titre = titre;
        this.description = description;
        this.status = status;
        this.nom_categorie = nom_categorie;
        this.deadline = deadline;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNom_categorie() {
        return nom_categorie;
    }

    public void setNom_categorie(String nom_categorie) {
        this.nom_categorie = nom_categorie;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Taches{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", nom_categorie='" + nom_categorie + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
