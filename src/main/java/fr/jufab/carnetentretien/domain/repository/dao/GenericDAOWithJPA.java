package fr.jufab.carnetentretien.domain.repository.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class GenericDAOWithJPA<T, ID extends Serializable> {
    private Class<T> persistentClass;

    @PersistenceContext(unitName = "MyPU")
    protected EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public GenericDAOWithJPA() {
        this.persistentClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    public T find(ID id) {
        return entityManager.find(persistentClass, id);
    }

    public T persist(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void merge(T entity) {
        entityManager.merge(entity);
    }

    public void remove(T entity) {
        entityManager.remove(entity);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
       return entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").getResultList();
    }


    @SuppressWarnings("unchecked")
    public List<T> findInRange(int firstResult, int maxResults) {
        return entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

    public long count() {
        return (Long) entityManager.createQuery("Select count(t) from " + persistentClass.getSimpleName() + " t").getSingleResult();
    }
}