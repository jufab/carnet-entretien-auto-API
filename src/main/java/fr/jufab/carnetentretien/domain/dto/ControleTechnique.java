package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ControleTechnique implements Serializable {

    public int id;

    public Date date;

    public Date prochainCT;

    public MaVoiture maVoiture;

    public ControleTechnique() {
    }

    public ControleTechnique(int id, Date date, Date prochainCT, MaVoiture maVoiture) {
        this.id = id;
        this.date = date;
        this.prochainCT = prochainCT;
        this.maVoiture = maVoiture;
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

    public MaVoiture getMaVoiture() {
        return maVoiture;
    }

    public void setMaVoiture(MaVoiture maVoiture) {
        this.maVoiture = maVoiture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ControleTechnique that = (ControleTechnique) o;
        return id == that.id &&
                Objects.equals(date, that.date) &&
                Objects.equals(prochainCT, that.prochainCT) &&
                Objects.equals(maVoiture, that.maVoiture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, prochainCT, maVoiture);
    }

    @Override
    public String toString() {
        return "ControleTechnique{" +
                "id=" + id +
                ", date=" + date +
                ", prochainCT=" + prochainCT +
                ", maVoiture=" + maVoiture +
                '}';
    }
}
