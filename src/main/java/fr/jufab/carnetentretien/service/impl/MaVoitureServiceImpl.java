package fr.jufab.carnetentretien.service.impl;

import fr.jufab.carnetentretien.domain.MaVoiture;
import fr.jufab.carnetentretien.domain.repository.MaVoitureRepository;
import fr.jufab.carnetentretien.service.MaVoitureService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MaVoitureServiceImpl implements MaVoitureService{

    @Inject
    private MaVoitureRepository maVoitureRepository;


    /*public MaVoitureServiceImpl(MaVoitureRepository maVoitureRepository) {
        this.maVoitureRepository = maVoitureRepository;
    }*/

    @Override
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
}
