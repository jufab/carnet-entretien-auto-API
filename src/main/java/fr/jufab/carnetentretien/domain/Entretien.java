package fr.jufab.carnetentretien.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Entretien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String libelle;

    public String commentaire;

    public int nombreAnnee;

    public Integer nombreKmMini;

    public Integer nombreKmMax;

    @ManyToMany(mappedBy = "desEntretiens")
    public List<TypeCarburant> typeDeCarburant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getNombreAnnee() {
        return nombreAnnee;
    }

    public void setNombreAnnee(int nombreAnnee) {
        this.nombreAnnee = nombreAnnee;
    }

    public Integer getNombreKmMini() {
        return nombreKmMini;
    }

    public void setNombreKmMini(Integer nombreKmMini) {
        this.nombreKmMini = nombreKmMini;
    }

    public Integer getNombreKmMax() {
        return nombreKmMax;
    }

    public void setNombreKmMax(Integer nombreKmMax) {
        this.nombreKmMax = nombreKmMax;
    }

    public List<TypeCarburant> getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(List<TypeCarburant> typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    public Entretien() {
    }

    public Entretien(String libelle, String commentaire, int nombreAnnee, Integer nombreKmMini, Integer nombreKmMax, List<TypeCarburant> typeDeCarburant) {
        this.libelle = libelle;
        this.commentaire = commentaire;
        this.nombreAnnee = nombreAnnee;
        this.nombreKmMini = nombreKmMini;
        this.nombreKmMax = nombreKmMax;
        this.typeDeCarburant = typeDeCarburant;
    }
}