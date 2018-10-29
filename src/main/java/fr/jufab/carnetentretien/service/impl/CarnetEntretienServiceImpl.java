package fr.jufab.carnetentretien.service.impl;

import fr.jufab.carnetentretien.domain.dto.CarnetEntretien;
import fr.jufab.carnetentretien.domain.repository.CarnetEntretienRepository;
import fr.jufab.carnetentretien.service.CarnetEntretienService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class CarnetEntretienServiceImpl implements CarnetEntretienService {

    private CarnetEntretienRepository carnetEntretienRepository;

    @Inject
    public CarnetEntretienServiceImpl(CarnetEntretienRepository carnetEntretienRepository) {
        this.carnetEntretienRepository = carnetEntretienRepository;
    }

    @Override
    @Transactional
    public CarnetEntretien persist(CarnetEntretien carnetEntretien) {
        return carnetEntretienRepository.persist(carnetEntretien);
    }

    @Override
    public List<CarnetEntretien> findAll() {
        return carnetEntretienRepository.findAll();
    }

    @Override
    public CarnetEntretien find(Integer id) {
        return carnetEntretienRepository.find(id);
    }

    @Override
    @Transactional
    public void merge(CarnetEntretien carnetEntretien) {
        carnetEntretienRepository.merge(carnetEntretien);
    }

    @Override
    @Transactional
    public void delete(int id) {
        carnetEntretienRepository.remove(id);
    }
}
