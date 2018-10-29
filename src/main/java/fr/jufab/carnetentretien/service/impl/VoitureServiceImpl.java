package fr.jufab.carnetentretien.service.impl;

import fr.jufab.carnetentretien.domain.dto.Voiture;
import fr.jufab.carnetentretien.domain.repository.VoitureRepository;
import fr.jufab.carnetentretien.service.VoitureService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class VoitureServiceImpl implements VoitureService {

    private VoitureRepository voitureRepository;

    @Inject
    public VoitureServiceImpl(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    @Override
    @Transactional
    public Voiture persist(Voiture voiture) {
        return voitureRepository.persist(voiture);
    }

    @Override
    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }

    @Override
    public Voiture find(Integer id) {
        return voitureRepository.find(id);
    }

    @Override
    @Transactional
    public void merge(Voiture voiture) {
        voitureRepository.merge(voiture);
    }

    @Override
    @Transactional
    public void delete(int id) {
        voitureRepository.remove(id);

    }


}
