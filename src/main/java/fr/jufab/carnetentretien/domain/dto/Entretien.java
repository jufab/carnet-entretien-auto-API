package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Entretien implements Serializable {


    public int id;

    public String libelle;

    public String commentaire;

    public int nombreAnnee;

    public Integer nombreKmMini;

    public Integer nombreKmMax;

    public List<TypeCarburant> typeDeCarburant;

    public Entretien() {
    }

    public Entretien(int id, String libelle, String commentaire, int nombreAnnee, Integer nombreKmMini, Integer nombreKmMax, List<TypeCarburant> typeDeCarburant) {
        this.id = id;
        this.libelle = libelle;
        this.commentaire = commentaire;
        this.nombreAnnee = nombreAnnee;
        this.nombreKmMini = nombreKmMini;
        this.nombreKmMax = nombreKmMax;
        this.typeDeCarburant = typeDeCarburant;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entretien that = (Entretien) o;
        return id == that.id &&
                nombreAnnee == that.nombreAnnee &&
                Objects.equals(libelle, that.libelle) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(nombreKmMini, that.nombreKmMini) &&
                Objects.equals(nombreKmMax, that.nombreKmMax) &&
                Objects.equals(typeDeCarburant, that.typeDeCarburant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, commentaire, nombreAnnee, nombreKmMini, nombreKmMax, typeDeCarburant);
    }

    @Override
    public String toString() {
        return "Entretien{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", nombreAnnee=" + nombreAnnee +
                ", nombreKmMini=" + nombreKmMini +
                ", nombreKmMax=" + nombreKmMax +
                ", typeDeCarburant=" + typeDeCarburant +
                '}';
    }
}
