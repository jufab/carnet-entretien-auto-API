package fr.jufab.carnetentretien.service.impl;

import fr.jufab.carnetentretien.domain.MaVoiture;
import fr.jufab.carnetentretien.domain.repository.MaVoitureRepository;
import fr.jufab.carnetentretien.service.MaVoitureService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MaVoitureServiceImpl implements MaVoitureService{

    private MaVoitureRepository maVoitureRepository;

    @Inject
    public MaVoitureServiceImpl(MaVoitureRepository maVoitureRepository) {
        this.maVoitureRepository = maVoitureRepository;
    }

    @Override
    public MaVoiture persist(MaVoiture maVoiture) {
        return maVoitureRepository.persist(maVoiture);
    }

    @Override
    public List<MaVoiture> findAll() {
        return maVoitureRepository.findAll();
    }
}
