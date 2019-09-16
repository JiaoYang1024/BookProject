package com.jy.book.web;

import com.jy.book.entity.Book;
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


    /*public List<Book> getLongNameBook(@RequestBody int nameCount){

        return bookService.getLongNameBook(nameCount);
    }*/
}
