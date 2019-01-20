package com.jwang.spring.springhibernate.service;

import java.util.List;

import com.jwang.spring.springhibernate.dao.AuthorDao;
import com.jwang.spring.springhibernate.entity.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Jason Wang
 */

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    @Transactional
    public void add(Author author) {
        authorDao.add(author);
    }

    @Transactional(readOnly = true)
    public List<Author> findAll() {
        return authorDao.findAll();
    }

}
