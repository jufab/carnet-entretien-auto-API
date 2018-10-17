package fr.jufab.carnetentretien.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class MarqueVoiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String nom;

    @OneToMany(mappedBy = "maMarqueDeVoiture")
    public List<MaVoiture> mesVoitures;

    public MarqueVoiture() {
    }

    public MarqueVoiture(String nom, List<MaVoiture> mesVoitures) {
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
}