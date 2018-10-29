package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ControleTechnique implements Serializable {

    public int id;

    public Date date;

    public Date prochainCT;

    public Voiture uneVoiture;

    public ControleTechnique() {
    }

    public ControleTechnique(int id, Date date, Date prochainCT, Voiture uneVoiture) {
        this.id = id;
        this.date = date;
        this.prochainCT = prochainCT;
        this.uneVoiture = uneVoiture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getProchainCT() {
        return prochainCT;
    }

    public void setProchainCT(Date prochainCT) {
        this.prochainCT = prochainCT;
    }

    public Voiture getUneVoiture() {
        return uneVoiture;
    }

    public void setUneVoiture(Voiture uneVoiture) {
        this.uneVoiture = uneVoiture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControleTechnique that = (ControleTechnique) o;
        return id == that.id &&
                Objects.equals(date, that.date) &&
                Objects.equals(prochainCT, that.prochainCT) &&
                Objects.equals(uneVoiture, that.uneVoiture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, prochainCT, uneVoiture);
    }

    @Override
    public String toString() {
        return "ControleTechnique{" +
                "id=" + id +
                ", date=" + date +
                ", prochainCT=" + prochainCT +
                ", uneVoiture=" + uneVoiture +
                '}';
    }
}
