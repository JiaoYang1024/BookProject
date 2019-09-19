package com.jy.book.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class BookNo  {


    @Id
    @GeneratedValue
    private Long id;


    private String publishHouse;

    private String publishDate;




    //没有book也行，只要book里有你就行
    //@OneToOne(cascade = CascadeType.ALL)
   // @OneToOne(cascade = CascadeType.ALL, mappedBy = "bookNo")
   // private Book book;   //查询时出现了递归现象  //不加mappedBy，查询时，Book中的BookNo属性为null。加上了，会递归。


    /*public BookNo() {
    }

    public BookNo(String publishHouse, String publishDate) {
        this.publishHouse = publishHouse;
        this.publishDate = publishDate;

    }

    public BookNo(String publishHouse, String publishDate, Book book) {
        this.publishHouse = publishHouse;
        this.publishDate = publishDate;
        this.book = book;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

   /* public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/

    @Override
    public String toString() {
        return "BookNo{" +
                "id=" + id +
                ", publishHouse='" + publishHouse + '\'' +
                ", publishDate='" + publishDate + '\'' +
                // ", book=" + book +
                '}';
    }
}
