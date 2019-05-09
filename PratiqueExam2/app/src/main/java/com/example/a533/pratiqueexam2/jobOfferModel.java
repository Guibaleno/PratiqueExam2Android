package com.example.a533.pratiqueexam2;

public class jobOfferModel {

    String titrePoste;
    String description;
    Float salaire;

    public jobOfferModel(String titrePoste,String description,Float salaire)
    {
        this.titrePoste = titrePoste;
        this.description = description;
        this.salaire = salaire;
    }

    public String getTitrePoste() {
        return titrePoste;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getSalaire() {
        return salaire;
    }

    public void setSalaire(Float salaire) {
        this.salaire = salaire;
    }


}
