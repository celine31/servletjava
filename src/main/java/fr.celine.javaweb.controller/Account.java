package fr.celine.javaweb.controller;

public class Account {
    public Account(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    private String nom;
    private String prenom;

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
}


