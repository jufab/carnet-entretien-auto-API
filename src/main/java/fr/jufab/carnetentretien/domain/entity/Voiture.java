package fr.jufab.carnetentretien.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;



@Entity
public class Voiture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String modele;

    public int annee;

    public Date dateAchat;

    @OneToOne(fetch = FetchType.LAZY)
    public ControleTechnique unControleTechnique;

    @ManyToOne(fetch = FetchType.LAZY)
    public MarqueVoiture uneMarqueDeVoiture;


    @OneToOne(fetch = FetchType.LAZY)
    public TypeCarburant typeDeCarburant;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "uneVoiture", cascade = CascadeType.ALL/*,orphanRemoval= true*/)
    public List<CarnetEntretien> desEntretiens;

    public Voiture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public ControleTechnique getUnControleTechnique() {
        return unControleTechnique;
    }

    public void setUnControleTechnique(ControleTechnique unControleTechnique) {
        this.unControleTechnique = unControleTechnique;
    }

    public MarqueVoiture getUneMarqueDeVoiture() {
        return uneMarqueDeVoiture;
    }

    public void setUneMarqueDeVoiture(MarqueVoiture uneMarqueDeVoiture) {
        this.uneMarqueDeVoiture = uneMarqueDeVoiture;
    }

    public TypeCarburant getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(TypeCarburant typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    public List<CarnetEntretien> getDesEntretiens() {
        return desEntretiens;
    }

    public void setDesEntretiens(List<CarnetEntretien> desEntretiens) {
        this.desEntretiens = desEntretiens;
    }

    public Voiture(String modele, int annee, Date dateAchat, ControleTechnique unControleTechnique, MarqueVoiture uneMarqueDeVoiture, TypeCarburant typeDeCarburant, List<CarnetEntretien> desEntretiens) {
        this.modele = modele;
        this.annee = annee;
        this.dateAchat = dateAchat;
        this.unControleTechnique = unControleTechnique;
        this.uneMarqueDeVoiture = uneMarqueDeVoiture;
        this.typeDeCarburant = typeDeCarburant;
        this.desEntretiens = desEntretiens;
    }
}