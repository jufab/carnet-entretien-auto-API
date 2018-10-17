package fr.jufab.carnetentretien.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class TypeCarburant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String carburant;

    @OneToMany(mappedBy = "typeDeCarburant")
    public List<MaVoiture> mesVoitures;


    @ManyToMany
    @JoinTable(
            name = "typecarburant_entretien",
            joinColumns = @JoinColumn(name = "typecarburant_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "entretien_id", referencedColumnName = "id"))
    public List<Entretien> desEntretiens;

    public TypeCarburant() {
    }

    public TypeCarburant(String carburant, List<MaVoiture> mesVoitures, List<Entretien> desEntretiens) {
        this.carburant = carburant;
        this.mesVoitures = mesVoitures;
        this.desEntretiens = desEntretiens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public List<MaVoiture> getMesVoitures() {
        return mesVoitures;
    }

    public void setMesVoitures(List<MaVoiture> mesVoitures) {
        this.mesVoitures = mesVoitures;
    }

    public List<Entretien> getDesEntretiens() {
        return desEntretiens;
    }

    public void setDesEntretiens(List<Entretien> desEntretiens) {
        this.desEntretiens = desEntretiens;
    }
}