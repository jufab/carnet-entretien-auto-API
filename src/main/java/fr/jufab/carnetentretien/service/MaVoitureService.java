package fr.jufab.carnetentretien.service;

import fr.jufab.carnetentretien.domain.MaVoiture;

import java.util.List;

public interface MaVoitureService {

    MaVoiture persist(MaVoiture maVoiture);

    List<MaVoiture> findAll();

}
