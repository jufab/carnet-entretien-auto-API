package fr.jufab.carnetentretien.service.impl;

import fr.jufab.carnetentretien.domain.dto.MaVoiture;
import fr.jufab.carnetentretien.domain.repository.MaVoitureRepository;
import fr.jufab.carnetentretien.service.MaVoitureService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class MaVoitureServiceImpl implements MaVoitureService{

    @Inject
    private MaVoitureRepository maVoitureRepository;


    @Override
    @Transactional
    public MaVoiture persist(MaVoiture maVoiture) {
        return maVoitureRepository.persist(maVoiture);
    }

    @Override
    public List<MaVoiture> findAll() {
        return maVoitureRepository.findAll();
    }

    @Override
    public MaVoiture find(Integer id) {
        return maVoitureRepository.find(id);
    }

    @Override
    @Transactional
    public void merge(MaVoiture maVoiture) {
        maVoitureRepository.merge(maVoiture);
    }

    @Override
    @Transactional
    public void delete(int id) {
        maVoitureRepository.remove(id);

    }


}
