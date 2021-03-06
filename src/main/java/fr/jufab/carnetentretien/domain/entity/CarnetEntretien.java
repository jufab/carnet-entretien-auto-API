package fr.jufab.carnetentretien.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class CarnetEntretien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public Date dateEntretien;

    public Date dateProchainEntretien;

    public int nombreKmIntervention;

    @ManyToOne(fetch = FetchType.LAZY)
    public Voiture uneVoiture;

    @OneToOne(fetch = FetchType.LAZY)
    public Entretien unEntretien;

    public CarnetEntretien() {
    }

    public CarnetEntretien(Date dateEntretien, Date dateProchainEntretien, int nombreKmIntervention, Voiture uneVoiture, Entretien unEntretien) {
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

    public int getNombreKmIntervention() {
        return nombreKmIntervention;
    }

    public void setNombreKmIntervention(int nombreKmIntervention) {
        this.nombreKmIntervention = nombreKmIntervention;
    }

    public Voiture getUneVoiture() {
        return uneVoiture;
    }

    public void setUneVoiture(Voiture uneVoiture) {
        this.uneVoiture = uneVoiture;
    }

    public Entretien getUnEntretien() {
        return unEntretien;
    }

    public void setUnEntretien(Entretien unEntretien) {
        this.unEntretien = unEntretien;
    }
}