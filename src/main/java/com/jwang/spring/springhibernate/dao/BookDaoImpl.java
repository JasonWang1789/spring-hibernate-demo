package com.jwang.spring.springhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager em;

    public void add(Book book) {
        em.persist(book);
    }

    public List<Book> findAll() {

        CriteriaQuery<Book> criteria = em.getCriteriaBuilder().createQuery(Book.class);

        Root<Book> root = criteria.from(Book.class);

        return em.createQuery(criteria).getResultList();

    }
}
