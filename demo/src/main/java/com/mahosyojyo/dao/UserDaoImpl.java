package com.mahosyojyo.dao;

import com.mahosyojyo.bean.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by FredFung on 2014/6/2.
 * Implementation of IUserDao
 */
/* TODO implement dao operation interface */
@Repository //Spring will auto-create this bean
public class UserDaoImpl implements IUserDao {

    //Let spring auto-inject into it
    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void insertUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> findAllUsers() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = builder.createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);
        criteriaQuery.select(root);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
