package com.jwang.spring.springhibernate.dao;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Book;

public interface BookDao {

    void add(Book book);

    List<Book> findAll();

}
