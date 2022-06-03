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
        return raisonsociale;
    }

    public void setNom(String raisonsociale) {
        this.raisonsociale = raisonsociale;
    }

    public String getSecteur_Activité() {
        return adresse;
    }

    public void setSecteur_Activité(String adresse) {
        this.adresse = adresse;
    }

    public double getNombre_employe() {
        return cpitale;
    }

    public void setNombre_employe(double cpitale) {
        this.cpitale = cpitale;
    }

    public Societe(int id, String Nom, String Secteur_Activité, double Nombre_employe) {
        this.id = id;
        this.Nom = Nom;
        this.Secteur_Activité = Secteur_Activité;
        this.Nombre_employe = Nombre_employe;
    }
}
