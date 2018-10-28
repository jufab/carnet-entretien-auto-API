package fr.jufab.carnetentretien.domain.dto;

import java.io.Serializable;
import java.util.Objects;

public class TypeCarburant implements Serializable {

    public int id;

    public String carburant;

    public TypeCarburant() {
    }

    public TypeCarburant(int id, String carburant) {
        this.id = id;
        this.carburant = carburant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeCarburant that = (TypeCarburant) o;
        return id == that.id &&
                Objects.equals(carburant, that.carburant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carburant);
    }

    @Override
    public String toString() {
        return "TypeCarburant{" +
                "id=" + id +
                ", carburant='" + carburant + '\'' +
                '}';
    }
}
