package com.jy.book.service;

import com.jy.book.entity.Author;
import com.jy.book.entity.Book;
import com.jy.book.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    public List<Book> getBooksByAuthor(String authorName){
        Author author = authorRepository.findAuthorByName(authorName);
       return author.getBookList();
    }
}
