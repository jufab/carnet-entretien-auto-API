package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MaVoiture implements Serializable {

    public int id;

    public String modele;

    public int annee;

    public Date dateAchat;

    public ControleTechnique unControleTechnique;

    public MarqueVoiture maMarqueDeVoiture;

    public TypeCarburant typeDeCarburant;

    public List<CarnetEntretien> mesEntretiens;

    public MaVoiture() {
    }

    public MaVoiture(int id, String modele, int annee, Date dateAchat, ControleTechnique unControleTechnique, MarqueVoiture maMarqueDeVoiture, TypeCarburant typeDeCarburant, List<CarnetEntretien> mesEntretiens) {
        this.id = id;
        this.modele = modele;
        this.annee = annee;
        this.dateAchat = dateAchat;
        this.unControleTechnique = unControleTechnique;
        this.maMarqueDeVoiture = maMarqueDeVoiture;
        this.typeDeCarburant = typeDeCarburant;
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

    public MarqueVoiture getMaMarqueDeVoiture() {
        return maMarqueDeVoiture;
    }

    public void setMaMarqueDeVoiture(MarqueVoiture maMarqueDeVoiture) {
        this.maMarqueDeVoiture = maMarqueDeVoiture;
    }

    public TypeCarburant getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(TypeCarburant typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    public List<CarnetEntretien> getMesEntretiens() {
        return mesEntretiens;
    }

    public void setMesEntretiens(List<CarnetEntretien> mesEntretiens) {
        this.mesEntretiens = mesEntretiens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaVoiture that = (MaVoiture) o;
        return id == that.id &&
                annee == that.annee &&
                Objects.equals(modele, that.modele) &&
                Objects.equals(dateAchat, that.dateAchat) &&
                Objects.equals(unControleTechnique, that.unControleTechnique) &&
                Objects.equals(maMarqueDeVoiture, that.maMarqueDeVoiture) &&
                Objects.equals(typeDeCarburant, that.typeDeCarburant) &&
                Objects.equals(mesEntretiens, that.mesEntretiens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modele, annee, dateAchat, unControleTechnique, maMarqueDeVoiture, typeDeCarburant, mesEntretiens);
    }

    @Override
    public String toString() {
        return "MaVoiture{" +
                "id=" + id +
                ", modele='" + modele + '\'' +
                ", annee=" + annee +
                ", dateAchat=" + dateAchat +
                ", unControleTechnique=" + unControleTechnique +
                ", maMarqueDeVoiture=" + maMarqueDeVoiture +
                ", typeDeCarburant=" + typeDeCarburant +
                ", mesEntretiens=" + mesEntretiens +
                '}';
    }
}
