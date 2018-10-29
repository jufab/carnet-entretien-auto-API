package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class MarqueVoiture implements Serializable {

    public int id;

    public String nom;

    public List<Voiture> desVoitures;

    public MarqueVoiture() {
    }

    public MarqueVoiture(int id, String nom, List<Voiture> desVoitures) {
        this.id = id;
        this.nom = nom;
        this.desVoitures = desVoitures;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Voiture> getDesVoitures() {
        return desVoitures;
    }

    public void setDesVoitures(List<Voiture> mesVoitures) {
        this.desVoitures = mesVoitures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarqueVoiture that = (MarqueVoiture) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(desVoitures, that.desVoitures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, desVoitures);
    }

    @Override
    public String toString() {
        return "MarqueVoiture{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", mesVoitures=" + desVoitures +
                '}';
    }
}
