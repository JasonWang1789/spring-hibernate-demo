package com.jwang.spring.springhibernate.service;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Author;

public interface AuthorService {

    void add(Author author);

    List<Author> findAll();

}
