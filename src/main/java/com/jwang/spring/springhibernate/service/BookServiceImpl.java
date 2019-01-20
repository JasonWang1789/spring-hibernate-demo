package com.jwang.spring.springhibernate.service;

import java.util.List;

import com.jwang.spring.springhibernate.dao.BookDao;
import com.jwang.spring.springhibernate.entity.Author;
import com.jwang.spring.springhibernate.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jason Wang
 */

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    @Transactional
    public void add(Book book) {
        bookDao.add(book);
    }

    @Transactional(readOnly = true)
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Transactional(readOnly = true)
    public List<Book> findBookByAuthor(Author author) {
        return bookDao.findBookByAuthor(author);
    }
}
