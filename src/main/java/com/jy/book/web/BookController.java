package com.jy.book.web;

import com.jy.book.entity.Author;
import com.jy.book.entity.Book;
import com.jy.book.entity.BookNo;
import com.jy.book.service.AuthorService;
import com.jy.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;

    @GetMapping
    public List<Book> getAllBook(){
      return   bookService.getAllBook();
    }


    @GetMapping("/find")
    public Book getBookById(@RequestParam long id){

        return bookService.getBookById(id);
    }

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        bookService.addBook(book);  //判断是否添加成功
        return "add success";
    }

    @PutMapping("/update")
    public String update(@RequestParam long id,@RequestBody Book book){
        bookService.updateBook(id,book);   //判断是否修改成功
        return "update success";
    }


    @PutMapping("/changename")
    public String update(@RequestParam long id, @RequestParam String name){
        bookService.updateBookName(id,name);   //判断是否修改成功
        return "update success";
    }


    @DeleteMapping("/deleteOne")
    public String deleteBookById(@RequestParam long id){
        bookService.deleteBookById(id);   //判断是否删除成功
        return "delete success";
    }


    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        bookService.deleteAllBook();   //判断是否删除成功
        return "delete success";
    }


    @GetMapping("/getBookAsc")
    public List<Book> getBookSortByAsc(){

        return bookService.getBookSortByAsc();
    }
    @GetMapping("/findBookAsc")
    public List<Book> findBookSortByAsc(@RequestBody Book name){

        return bookService.findBookSortByAsc(name.getName());
    }
    @GetMapping("/getBookDesc")
    public List<Book> getBookSortByDesc(){

        return bookService.getBookSortByDesc();
    }

    @GetMapping("/searchBookByName")
    public List<Book> searchBookByName(@RequestBody Book book){
        return bookService.searchBookByName(book.getName());
    }


    @GetMapping("/searchBookByPrice")
    public List<Book> searchBookByPrice(@RequestBody Book book){
        return bookService.searchBookByPrice(book.getPrice());
    }

    @GetMapping("/searchBookByPrice2")
    public List<Book> searchBookByPrice(@RequestBody List<Book> book){

        return bookService.searchBookByPrice(book.get(0).getPrice(),book.get(1).getPrice());
    }
    @GetMapping("/searchBookByPrice3")
    public List<Book> searchBookByPrice3(@RequestBody List<Book> book){

        return bookService.searchBookByPrice3(book.get(0).getPrice(),book.get(1).getPrice());
    }
    @GetMapping("/searchBookByNameAndPrice")
    public List<Book> searchBookByNameAndPrice(@RequestBody List<Book> book){

        return bookService.searchBookByPrice(book.get(0).getName(),book.get(1).getPrice());
    }

    /*public List<Book> getLongNameBook(@RequestBody int nameCount){

        return bookService.getLongNameBook(nameCount);
    }*/

    @PostMapping("/addBook")
    public String addBookPro(@RequestBody Book book){
        bookService.addBookPro(book);
        return "add success";
    }

    @PostMapping("/addBook2")
    public String addBookPro2(@RequestBody BookNo book){
        bookService.addBookPro(book);
        return "add success";
    }

    @GetMapping("/getBooksByAuthor")
    public List<Book> getBooksByAuthor(@RequestBody Author author){

        return authorService.getBooksByAuthor(author.getName());

    }


}
