package fr.jufab.carnetentretien.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class ControleTechnique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public Date date;

    public Date prochainCT;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "unControleTechnique")
    public Voiture uneVoiture;

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

    public ControleTechnique() {
    }

    public ControleTechnique(Date date, Date prochainCT, Voiture uneVoiture) {
        this.date = date;
        this.prochainCT = prochainCT;
        this.uneVoiture = uneVoiture;
    }
}