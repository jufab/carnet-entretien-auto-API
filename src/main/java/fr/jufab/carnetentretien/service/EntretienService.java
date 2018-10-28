package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.dto.Entretien;

import java.util.List;

public interface EntretienService {

    List<Entretien> findAll();

    Entretien find(Integer id);
}
