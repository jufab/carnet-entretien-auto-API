package fr.jufab.carnetentretien.domain.repository;

import fr.jufab.carnetentretien.domain.dto.Entretien;
import fr.jufab.carnetentretien.domain.dto.mapper.EntretienSelmaMapper;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;

public class EntretienRepository {

    @PersistenceContext(unitName = "MyPU")
    private EntityManager entityManager;

    private EntretienSelmaMapper mapper;

    @Inject
    public EntretienRepository(EntretienSelmaMapper mapper) {
        this.mapper = mapper;
    }

    public Entretien find(int id) {
        return mapper.asEntretienDTO(entityManager.find(fr.jufab.carnetentretien.domain.entity.Entretien.class, id));
    }

    public Entretien persist(Entretien entityDTO) {
        fr.jufab.carnetentretien.domain.entity.Entretien entity = mapper.asEntretien(entityDTO);
        entityManager.persist(entity);
        return mapper.asEntretienDTO(entity);
    }


    public void merge(Entretien entityDTO) {
        fr.jufab.carnetentretien.domain.entity.Entretien entity = mapper.asEntretien(entityDTO);
        entityManager.merge(entity);
    }

    public void remove(int id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaDelete<fr.jufab.carnetentretien.domain.entity.Entretien> delete = cb.createCriteriaDelete(fr.jufab.carnetentretien.domain.entity.Entretien.class);
        Root<fr.jufab.carnetentretien.domain.entity.Entretien> en = delete.from(fr.jufab.carnetentretien.domain.entity.Entretien.class);
        delete.where(cb.equal(en.get("id"), id));
        entityManager.createQuery(delete).executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Entretien> findAll() {
        List<fr.jufab.carnetentretien.domain.entity.Entretien> desEntretiens = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.Entretien.class.getSimpleName() + " t").getResultList();
        List<Entretien> desEntretiensDTO = desEntretiens.stream().map(entretien -> mapper.asEntretienDTO(entretien)).collect(Collectors.toList());
        return desEntretiensDTO;
    }


    @SuppressWarnings("unchecked")
    public List<Entretien> findInRange(int firstResult, int maxResults) {
        List<fr.jufab.carnetentretien.domain.entity.Entretien> mesEntretiens = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.Entretien.class.getSimpleName() + " t").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
        List<Entretien> desEntretiensDTO = mesEntretiens.stream().map(entretien -> mapper.asEntretienDTO(entretien)).collect(Collectors.toList());
        return desEntretiensDTO;
    }

    public long count() {
        return (Long) entityManager.createQuery("Select count(t) from " + fr.jufab.carnetentretien.domain.entity.Entretien.class.getSimpleName() + " t").getSingleResult();
    }
}
