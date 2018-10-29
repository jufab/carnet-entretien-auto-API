package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.dto.Voiture;

import java.util.List;

public interface VoitureService {

    Voiture persist(Voiture voiture);

    List<Voiture> findAll();

    Voiture find(Integer id);

    void merge(Voiture voiture);

    void delete(int id);
}
