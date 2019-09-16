package com.jy.book.service;


import com.jy.book.entity.Book;
import com.jy.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public Book getBookById(long id) {

        Book book = new Book();


        Optional<Book> bookPackage =   bookRepository.findById(id);
        if (bookPackage.isPresent()){
            book = bookPackage.get();
        }

        return  book;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(long id, Book book) {
//        book.setId(id);
        bookRepository.save(book);
    }

    public void deleteBookById(long id) {
        bookRepository.deleteById(id);
    }

    public void deleteAllBook() {
        bookRepository.deleteAll();
    }

    public void updateBookName(long id, String name) {
        Book book  = bookRepository.findById(id).get();
        book.setName(name);
      //  bookRepository.save(book);
    }

    public List<Book> getBookSortByAsc() {

      return  bookRepository.findAll(new Sort(Sort.Direction.ASC,"price"));
    }

   /* public List<Book> getLongNameBook(int nameCount) {

    }*/
}
