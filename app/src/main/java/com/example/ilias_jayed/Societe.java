package com.example.ilias_jayed;

import java.io.Serializable;

public class Societe implements Serializable {
    public int id;
    private String Nom;
    private String Secteur_Activité;
    private double Nombre_employe ;

    public Societe() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getSecteur_Activité() {
        return Secteur_Activité;
    }

    public void setSecteur_Activité(String Secteur_Activité) {
        this.Secteur_Activité = Secteur_Activité;
    }

    public double getNombre_employe() {
        return Nombre_employe;
    }

    public void setNombre_employe(double Nombre_employe) {
        this.Nombre_employe = Nombre_employe;
    }

    public Societe(int id, String Nom, String Secteur_Activité, double Nombre_employe) {
        this.id = id;
        this.Nom = Nom;
        this.Secteur_Activité = Secteur_Activité;
        this.Nombre_employe = Nombre_employe;
    }
}
