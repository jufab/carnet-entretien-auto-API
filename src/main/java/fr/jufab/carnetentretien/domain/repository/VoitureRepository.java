package fr.jufab.carnetentretien.domain.repository;

import fr.jufab.carnetentretien.domain.dto.Voiture;
import fr.jufab.carnetentretien.domain.dto.mapper.VoitureSelmaMapper;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;


public class VoitureRepository {

    @PersistenceContext(unitName = "MyPU")
    private EntityManager entityManager;

    private VoitureSelmaMapper mapper;

    @Inject
    public VoitureRepository(VoitureSelmaMapper mapper) {
        this.mapper = mapper;
    }

    public Voiture find(int id) {
        return mapper.asVoitureDTO(entityManager.find(fr.jufab.carnetentretien.domain.entity.Voiture.class, id));
    }

    public Voiture persist(Voiture entityDTO) {
        fr.jufab.carnetentretien.domain.entity.Voiture entity = mapper.asVoiture(entityDTO);
        entityManager.persist(entity);
        return mapper.asVoitureDTO(entity);
    }


    public void merge(Voiture entityDTO) {
        fr.jufab.carnetentretien.domain.entity.Voiture entity = mapper.asVoiture(entityDTO);
        entityManager.merge(entity);
    }

    public void remove(int id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaDelete<fr.jufab.carnetentretien.domain.entity.Voiture> delete = cb.createCriteriaDelete(fr.jufab.carnetentretien.domain.entity.Voiture.class);
        Root<fr.jufab.carnetentretien.domain.entity.Voiture> en = delete.from(fr.jufab.carnetentretien.domain.entity.Voiture.class);
        delete.where(cb.equal(en.get("id"), id));
        entityManager.createQuery(delete).executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Voiture> findAll() {
        List<fr.jufab.carnetentretien.domain.entity.Voiture> desVoitures = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.Voiture.class.getSimpleName() + " t").getResultList();
        List<Voiture> desVoituresDTO = desVoitures.stream().map(voiture -> mapper.asVoitureDTO(voiture)).collect(Collectors.toList());
        return desVoituresDTO;
    }


    @SuppressWarnings("unchecked")
    public List<Voiture> findInRange(int firstResult, int maxResults) {
        List<fr.jufab.carnetentretien.domain.entity.Voiture> desVoitures = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.Voiture.class.getSimpleName() + " t").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
        List<Voiture> desVoituresDTO = desVoitures.stream().map(voiture -> mapper.asVoitureDTO(voiture)).collect(Collectors.toList());
        return desVoituresDTO;
    }

    public long count() {
        return (Long) entityManager.createQuery("Select count(t) from " + fr.jufab.carnetentretien.domain.entity.Voiture.class.getSimpleName() + " t").getSingleResult();
    }
    
    

}
