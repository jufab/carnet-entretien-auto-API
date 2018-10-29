package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CarnetEntretien implements Serializable {
    public int id;

    public Date dateEntretien;

    public Date dateProchainEntretien;

    public int nombreKmIntervention;

    public Voiture uneVoiture;

    public Entretien unEntretien;

    public CarnetEntretien() {

    }

    public CarnetEntretien(int id, Date dateEntretien, Date dateProchainEntretien, int nombreKmIntervention, Voiture uneVoiture, Entretien unEntretien) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarnetEntretien that = (CarnetEntretien) o;
        return id == that.id &&
                nombreKmIntervention == that.nombreKmIntervention &&
                Objects.equals(dateEntretien, that.dateEntretien) &&
                Objects.equals(dateProchainEntretien, that.dateProchainEntretien) &&
                Objects.equals(uneVoiture, that.uneVoiture) &&
                Objects.equals(unEntretien, that.unEntretien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateEntretien, dateProchainEntretien, nombreKmIntervention, uneVoiture, unEntretien);
    }

    @Override
    public String toString() {
        return "CarnetEntretien{" +
                "id=" + id +
                ", dateEntretien=" + dateEntretien +
                ", dateProchainEntretien=" + dateProchainEntretien +
                ", nombreKmIntervention=" + nombreKmIntervention +
                ", uneVoiture=" + uneVoiture +
                ", unEntretien=" + unEntretien +
                '}';
    }
}
