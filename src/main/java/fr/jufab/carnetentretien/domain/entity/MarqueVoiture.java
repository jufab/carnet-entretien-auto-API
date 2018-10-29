package fr.jufab.carnetentretien.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class MarqueVoiture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String nom;

    @OneToMany(mappedBy = "uneMarqueDeVoiture")
    public List<Voiture> desVoitures;

    public MarqueVoiture() {
    }

    public MarqueVoiture(String nom, List<Voiture> desVoitures) {
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

    public void setDesVoitures(List<Voiture> desVoitures) {
        this.desVoitures = desVoitures;
    }
}