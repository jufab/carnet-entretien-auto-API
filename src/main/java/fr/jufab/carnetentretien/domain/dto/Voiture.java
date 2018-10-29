package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Voiture implements Serializable {

    public int id;

    public String modele;

    public int annee;

    public Date dateAchat;

    public ControleTechnique unControleTechnique;

    public MarqueVoiture uneMarqueDeVoiture;

    public TypeCarburant typeDeCarburant;

    public List<CarnetEntretien> desEntretiens;

    public Voiture() {
    }

    public Voiture(int id, String modele, int annee, Date dateAchat, ControleTechnique unControleTechnique, MarqueVoiture maMarqueDeVoiture, TypeCarburant typeDeCarburant, List<CarnetEntretien> desEntretiens) {
        this.id = id;
        this.modele = modele;
        this.annee = annee;
        this.dateAchat = dateAchat;
        this.unControleTechnique = unControleTechnique;
        this.uneMarqueDeVoiture = maMarqueDeVoiture;
        this.typeDeCarburant = typeDeCarburant;
        this.desEntretiens = desEntretiens;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture that = (Voiture) o;
        return id == that.id &&
                annee == that.annee &&
                Objects.equals(modele, that.modele) &&
                Objects.equals(dateAchat, that.dateAchat) &&
                Objects.equals(unControleTechnique, that.unControleTechnique) &&
                Objects.equals(uneMarqueDeVoiture, that.uneMarqueDeVoiture) &&
                Objects.equals(typeDeCarburant, that.typeDeCarburant) &&
                Objects.equals(desEntretiens, that.desEntretiens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modele, annee, dateAchat, unControleTechnique, uneMarqueDeVoiture, typeDeCarburant, desEntretiens);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                ", modele='" + modele + '\'' +
                ", annee=" + annee +
                ", dateAchat=" + dateAchat +
                ", unControleTechnique=" + unControleTechnique +
                ", maMarqueDeVoiture=" + uneMarqueDeVoiture +
                ", typeDeCarburant=" + typeDeCarburant +
                ", desEntretiens=" + desEntretiens +
                '}';
    }
}
