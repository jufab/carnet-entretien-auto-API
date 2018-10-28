package fr.jufab.carnetentretien.domain.repository;

import fr.jufab.carnetentretien.domain.dto.MaVoiture;
import fr.jufab.carnetentretien.domain.dto.mapper.MaVoitureSelmaMapper;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;


public class MaVoitureRepository {

    @PersistenceContext(unitName = "MyPU")
    private EntityManager entityManager;

    @Inject
    private MaVoitureSelmaMapper mapper;



    public MaVoiture find(int id) {
        return mapper.asMaVoitureDTO(entityManager.find(fr.jufab.carnetentretien.domain.entity.MaVoiture.class, id));
    }

    public MaVoiture persist(MaVoiture entityDTO) {
        fr.jufab.carnetentretien.domain.entity.MaVoiture entity = mapper.asMaVoiture(entityDTO);
        entityManager.persist(entity);
        return mapper.asMaVoitureDTO(entity);
    }


    public void merge(MaVoiture entityDTO) {
        fr.jufab.carnetentretien.domain.entity.MaVoiture entity = mapper.asMaVoiture(entityDTO);
        entityManager.merge(entity);
    }

    public void remove(int id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaDelete<fr.jufab.carnetentretien.domain.entity.MaVoiture> delete = cb.createCriteriaDelete(fr.jufab.carnetentretien.domain.entity.MaVoiture.class);
        Root<fr.jufab.carnetentretien.domain.entity.MaVoiture> en = delete.from(fr.jufab.carnetentretien.domain.entity.MaVoiture.class);
        delete.where(cb.equal(en.get("id"), id));
        entityManager.createQuery(delete).executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<MaVoiture> findAll() {
        List<fr.jufab.carnetentretien.domain.entity.MaVoiture> mesVoitures = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.MaVoiture.class.getSimpleName() + " t").getResultList();
        List<MaVoiture> mesVoituresDTO = mesVoitures.stream().map(voiture -> mapper.asMaVoitureDTO(voiture)).collect(Collectors.toList());
        return mesVoituresDTO;
    }


    @SuppressWarnings("unchecked")
    public List<MaVoiture> findInRange(int firstResult, int maxResults) {
        List<fr.jufab.carnetentretien.domain.entity.MaVoiture> mesVoitures = entityManager.createQuery("Select t from " + fr.jufab.carnetentretien.domain.entity.MaVoiture.class.getSimpleName() + " t").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
        List<MaVoiture> mesVoituresDTO = mesVoitures.stream().map(voiture -> mapper.asMaVoitureDTO(voiture)).collect(Collectors.toList());
        return mesVoituresDTO;
    }

    public long count() {
        return (Long) entityManager.createQuery("Select count(t) from " + fr.jufab.carnetentretien.domain.entity.MaVoiture.class.getSimpleName() + " t").getSingleResult();
    }
    
    

}
