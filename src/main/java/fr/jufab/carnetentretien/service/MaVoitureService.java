package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.dto.MaVoiture;

import java.util.List;

public interface MaVoitureService {

    MaVoiture persist(MaVoiture maVoiture);

    List<MaVoiture> findAll();

    MaVoiture find(Integer id);

    void merge(MaVoiture maVoiture);

    void delete(int id);

}
