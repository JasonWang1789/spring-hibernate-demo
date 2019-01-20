package com.jwang.spring.springhibernate.dao;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Author;

/**
 * @author Jason Wang
 */

public interface AuthorDao {

    void add(Author author);

    List<Author> findAll();

}
