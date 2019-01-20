package com.jwang.spring.springhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Author;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoImpl implements AuthorDao {

    @PersistenceContext
    private EntityManager em;

    public void add(Author author) {
        em.persist(author);
    }

    @SuppressWarnings("unchecked")
    public List<Author> findAll() {

        String query = "select * from author";

        return em.createNativeQuery(query, Author.class).getResultList();
    }
}
