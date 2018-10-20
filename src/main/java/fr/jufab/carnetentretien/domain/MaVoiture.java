package fr.jufab.carnetentretien.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Entity
public class MaVoiture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String modele;

    public int annee;

    public Date dateAchat;

    @OneToOne(fetch = FetchType.LAZY)
    public ControleTechnique unControleTechnique;

    @ManyToOne(fetch = FetchType.LAZY)
    public MarqueVoiture maMarqueDeVoiture;


    @ManyToOne(fetch = FetchType.LAZY)
    public TypeCarburant typeDeCarburant;


    @OneToMany(fetch = FetchType.LAZY)
    public List<CarnetEntretien> mesEntretiens;

    public MaVoiture() {
    }

    public MaVoiture(String modele, int annee, Date dateAchat, ControleTechnique unControleTechnique, MarqueVoiture maMarqueDeVoiture, TypeCarburant typeDeCarburant, List<CarnetEntretien> mesEntretiens) {
        this.modele = modele;
        this.annee = annee;
        this.dateAchat = dateAchat;
        this.unControleTechnique = unControleTechnique;
        this.maMarqueDeVoiture = maMarqueDeVoiture;
        this.typeDeCarburant = typeDeCarburant;
        this.mesEntretiens = mesEntretiens;
    }

    public Optional<List<CarnetEntretien>> getMesEntretiens() {
        return Optional.ofNullable(mesEntretiens);
    }

    public void setMesEntretiens(List<CarnetEntretien> mesEntretiens) {
        this.mesEntretiens = mesEntretiens;
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

    public Optional<ControleTechnique> getUnControleTechnique() {
        return Optional.ofNullable(unControleTechnique);
    }

    public void setUnControleTechnique(ControleTechnique unControleTechnique) {
        this.unControleTechnique = unControleTechnique;
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

    public Optional<MarqueVoiture> getMaMarqueDeVoiture() {
        return Optional.ofNullable(maMarqueDeVoiture);
    }

    public void setMaMarqueDeVoiture(MarqueVoiture maMarqueDeVoiture) {
        this.maMarqueDeVoiture = maMarqueDeVoiture;
    }

    public Optional<TypeCarburant> getTypeDeCarburant() {
        return Optional.ofNullable(typeDeCarburant);
    }

    public void setTypeDeCarburant(TypeCarburant typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

}