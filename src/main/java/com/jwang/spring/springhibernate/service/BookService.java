package com.jwang.spring.springhibernate.service;

import java.util.List;

import com.jwang.spring.springhibernate.entity.Author;
import com.jwang.spring.springhibernate.entity.Book;

/**
 * @author Jason Wang
 */

public interface BookService {

    void add(Book book);

    List<Book> findAll();

    List<Book> findBookByAuthor(Author author);

}
