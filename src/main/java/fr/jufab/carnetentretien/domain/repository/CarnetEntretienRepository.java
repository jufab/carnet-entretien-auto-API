package fr.jufab.carnetentretien.domain.repository;

import fr.jufab.carnetentretien.domain.dto.CarnetEntretien;
import fr.jufab.carnetentretien.domain.dto.mapper.CarnetEntretienSelmaMapper;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;

public class CarnetEntretienRepository {

    @PersistenceContext(unitName = "MyPU")
    private EntityManager entityManager;

    private CarnetEntretienSelmaMapper mapper;

    @Inject
    public CarnetEntretienRepository(CarnetEntretienSelmaMapper mapper) {
        this.mapper = mapper;
    }

    public CarnetEntretien find(int id) {
        return mapper.asCarnetEntretienDTO(entityManager.find(fr.jufab.carnetentretien.domain.entity.CarnetEntretien.class, id));
    }

    public CarnetEntretien persist(CarnetEntretien entityDTO) {
        fr.jufab.carnetentretien.domain.entity.CarnetEntretien entity = mapper.asCarnetEntretien(entityDTO);
        entityManager.persist(entity);
        return mapper.asCarnetEntretienDTO(entity);
    }


    public void merge(CarnetEntretien entityDTO) {
        fr.jufab.carnetentretien.domain.entity.CarnetEntretien entity = mapper.asCarnetEntretien(entityDTO);
        entityManager.merge(entity);
    }

    public void remove(int id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaDelete<fr.jufab.carnetentretien.domain.entity.CarnetEntretien> delete = cb.createCriteriaDelete(fr.jufab.carnetentretien.domain.entity.CarnetEntretien.class);
        Root<fr.jufab.carnetentretien.domain.entity.CarnetEntretien> en = delete.from(fr.jufab.carnetentretien.domain.entity.CarnetEntretien.class);
        delete.where(cb.equal(en.get("id"), id));
        entityManager.createQuery(delete).executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<CarnetEntretien> findAll() {
        List<fr.jufab.carnetentretien.domain.entity.CarnetEntretien> desCarnetEntretiens = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.CarnetEntretien.class.getSimpleName() + " t").getResultList();
        List<CarnetEntretien> desCarnetEntretiensDTO = desCarnetEntretiens.stream().map(carnetEntretien -> mapper.asCarnetEntretienDTO(carnetEntretien)).collect(Collectors.toList());
        return desCarnetEntretiensDTO;
    }


    @SuppressWarnings("unchecked")
    public List<CarnetEntretien> findInRange(int firstResult, int maxResults) {
        List<fr.jufab.carnetentretien.domain.entity.CarnetEntretien> desCarnetEntretiens = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.CarnetEntretien.class.getSimpleName() + " t").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
        List<CarnetEntretien> desCarnetEntretiensDTO = desCarnetEntretiens.stream().map(carnetEntretien -> mapper.asCarnetEntretienDTO(carnetEntretien)).collect(Collectors.toList());
        return desCarnetEntretiensDTO;
    }

    public long count() {
        return (Long) entityManager.createQuery("Select count(t) from " + fr.jufab.carnetentretien.domain.entity.CarnetEntretien.class.getSimpleName() + " t").getSingleResult();
    }


}
