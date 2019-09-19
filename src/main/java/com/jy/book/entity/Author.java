package com.jy.book.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Author {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String gender;

    private int age;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "authorList")
    private List<Book> bookList;


    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
