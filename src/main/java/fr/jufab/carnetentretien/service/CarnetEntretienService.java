package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.dto.CarnetEntretien;

import java.util.List;

public interface CarnetEntretienService {

    CarnetEntretien persist(CarnetEntretien carnetEntretien);

    List<CarnetEntretien> findAll();

    CarnetEntretien find(Integer id);

    void merge(CarnetEntretien carnetEntretien);

    void delete(int id);

}
