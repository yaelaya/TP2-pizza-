package com.example.app2.classes;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;

    private int photo;
    private float duree;
    private String description;
    private String detailsIngred;
    private String preparation;

    private static int compteur;

    List<String> l = new ArrayList<>();

    public Produit(String nom, int nbrIngredients,int photo, float duree, String detailsIngred, String description, String preparation) {
        this.id = ++compteur;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public Produit() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public float getDuree() {
        return duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public List<String> getL() {
        return l;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setL(List<String> l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", l=" + l +
                '}';
    }
}
