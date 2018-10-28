package fr.jufab.carnetentretien.service.impl;

import fr.jufab.carnetentretien.domain.dto.Entretien;
import fr.jufab.carnetentretien.domain.repository.EntretienRepository;
import fr.jufab.carnetentretien.service.EntretienService;

import javax.inject.Inject;
import java.util.List;

public class EntretienServiceImpl implements EntretienService {

    private EntretienRepository entretienRepository;

    @Inject
    public EntretienServiceImpl(EntretienRepository entretienRepository) {
        this.entretienRepository = entretienRepository;
    }

    @Override
    public List<Entretien> findAll() {
        return entretienRepository.findAll();
    }

    @Override
    public Entretien find(Integer id) {
        return entretienRepository.find(id);
    }
}
