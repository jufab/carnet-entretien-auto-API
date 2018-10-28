package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class MarqueVoiture implements Serializable {

    public int id;

    public String nom;

    public List<MaVoiture> mesVoitures;

    public MarqueVoiture() {
    }

    public MarqueVoiture(int id, String nom, List<MaVoiture> mesVoitures) {
        this.id = id;
        this.nom = nom;
        this.mesVoitures = mesVoitures;
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

    public List<MaVoiture> getMesVoitures() {
        return mesVoitures;
    }

    public void setMesVoitures(List<MaVoiture> mesVoitures) {
        this.mesVoitures = mesVoitures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarqueVoiture that = (MarqueVoiture) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(mesVoitures, that.mesVoitures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, mesVoitures);
    }

    @Override
    public String toString() {
        return "MarqueVoiture{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", mesVoitures=" + mesVoitures +
                '}';
    }
}
