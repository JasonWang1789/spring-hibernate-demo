package com.jwang.spring.springhibernate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        // add authors
        AuthorService authorService = applicationContext.getBean(AuthorService.class);
        Author author1 = new Author().setFirstName("Cixin").setLastName("liu");
        Author author2 = new Author().setFirstName("Xueqin").setLastName("cao");
        Author author3 = new Author().setFirstName("Hua").setLastName("Yu");
        authorService.add(author1);
        authorService.add(author2);
        authorService.add(author3);

        // add books
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.add(new Book().setTitle("three body problem").setAuthor(author1));
        bookService.add(new Book().setTitle("fly to the future").setAuthor(author1));
        bookService.add(new Book().setTitle("3rd book by the same author").setAuthor(author2));
        bookService.add(new Book().setTitle("4th book by another author").setAuthor(author3));

        // find all authors
        List<Author> authorList = authorService.findAll();
        authorList.forEach(System.out::println);

        // find all books
        List<Book> bookList = bookService.findAll();
        bookList.forEach(System.out::println);

        // find all books by author
        List<Book> bookList2 = bookService.findBookByAuthor(author1);
        bookList2.forEach(System.out::println);

        // get all beans
        // Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
