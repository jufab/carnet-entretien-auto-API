package fr.jufab.carnetentretien.domain.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TypeCarburant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String carburant;

    public TypeCarburant() {
    }

    public TypeCarburant(String carburant) {
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
}