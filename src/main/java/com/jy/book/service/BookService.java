package com.jy.book.service;


import com.jy.book.entity.Book;
import com.jy.book.entity.BookNo;
import com.jy.book.repository.BookNoRepository;
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

    @Autowired
    BookNoRepository bookNoRepository;


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

    public List<Book> getBookSortByDesc() {
        return bookRepository.findAll(new Sort(Sort.Direction.DESC,"price"));
    }

    public List<Book> searchBookByName(String name) {
        return bookRepository.findByName(name);
    }

    public List<Book> searchBookByPrice(double price) {
        return bookRepository.findByPrice(price);
    }

    public List<Book> searchBookByPrice(double price,double price1) {
        return bookRepository.findByPriceOrPrice(price,price1);
    }

    public List<Book> searchBookByPrice(String name,double price) {
        return bookRepository.findByNameAndPrice(name,price);
    }

    public List<Book> findBookSortByAsc(String name) {
        return bookRepository.findByNameOrderByPriceAsc(name);
    }

    public List<Book> searchBookByPrice3(double price, double price1) {
        return bookRepository.findByPriceInSql(price,price1);
    }

    public void addBookPro(Book book) {
        System.out.println("=================");
        System.out.println(book.toString());
        System.out.println("=================");
        bookRepository.save(book);
    }

    public void addBookPro(BookNo book) {
        bookNoRepository.save(book);
    }
   /* public List<Book> getLongNameBook(int nameCount) {

    }*/
}
