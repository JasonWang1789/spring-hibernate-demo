package com.jwang.spring.springhibernate.service;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Book;

public interface BookService {

    void add (Book book);

    List<Book> findAll();

}
