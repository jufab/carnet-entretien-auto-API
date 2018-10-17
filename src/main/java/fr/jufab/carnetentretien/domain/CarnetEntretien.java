package fr.jufab.carnetentretien.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CarnetEntretien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public Date dateEntretien;

    public Date dateProchainEntretien;

    public int nombreKmIntervention;

    @OneToOne
    public MaVoiture uneVoiture;

    @OneToOne
    public Entretien unEntretien;

    public CarnetEntretien() {
    }

    public CarnetEntretien(Date dateEntretien, Date dateProchainEntretien, int nombreKmIntervention, MaVoiture uneVoiture, Entretien unEntretien) {
        this.dateEntretien = dateEntretien;
        this.dateProchainEntretien = dateProchainEntretien;
        this.nombreKmIntervention = nombreKmIntervention;
        this.uneVoiture = uneVoiture;
        this.unEntretien = unEntretien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateEntretien() {
        return dateEntretien;
    }

    public void setDateEntretien(Date dateEntretien) {
        this.dateEntretien = dateEntretien;
    }

    public Date getDateProchainEntretien() {
        return dateProchainEntretien;
    }

    public void setDateProchainEntretien(Date dateProchainEntretien) {
        this.dateProchainEntretien = dateProchainEntretien;
    }

    public MaVoiture getUneVoiture() {
        return uneVoiture;
    }

    public void setUneVoiture(MaVoiture uneVoiture) {
        this.uneVoiture = uneVoiture;
    }

    public Entretien getUnEntretien() {
        return unEntretien;
    }

    public void setUnEntretien(Entretien unEntretien) {
        this.unEntretien = unEntretien;
    }

    public int getNombreKmIntervention() {
        return nombreKmIntervention;
    }

    public void setNombreKmIntervention(int nombreKmIntervention) {
        this.nombreKmIntervention = nombreKmIntervention;
    }
}