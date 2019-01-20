package com.jwang.spring.springhibernate;

import java.util.List;

import com.jwang.spring.springhibernate.config.DbConfiguration;
import com.jwang.spring.springhibernate.entity.Author;
import com.jwang.spring.springhibernate.entity.Book;
import com.jwang.spring.springhibernate.service.AuthorService;
import com.jwang.spring.springhibernate.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUtil {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(DbConfiguration.class);

        // add author
        AuthorService authorService = applicationContext.getBean(AuthorService.class);
        Author author = new Author().setFirstName("Cixin").setLastName("liu");
        authorService.add(author);

        // add books
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.add(new Book().setTitle("three body problem").setAuthor(author));
        bookService.add(new Book().setTitle("fly to the future").setAuthor(author));
        bookService.add(new Book().setTitle("3rd book by the same author").setAuthor(author));

        // find all authors
        List<Author> authorList = authorService.findAll();
        authorList.forEach(System.out::println);

        // find all books
        List<Book> bookList = bookService.findAll();
        bookList.forEach(System.out::println);

    }

}
