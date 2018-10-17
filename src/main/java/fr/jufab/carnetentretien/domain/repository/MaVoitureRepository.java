package fr.jufab.carnetentretien.domain.repository;

import fr.jufab.carnetentretien.domain.MaVoiture;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MaVoitureRepository {

    @PersistenceContext
    EntityManager em;

    public MaVoitureRepository() {
    }

    public MaVoiture save(MaVoiture maVoiture) {
        em.getTransaction().begin();
        em.persist(maVoiture);
        em.getTransaction().commit();

    }
}
