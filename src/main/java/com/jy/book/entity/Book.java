package com.jy.book.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Book  {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private double price;


   // @JoinColumn(name="bookNo")
    @OneToOne(cascade = CascadeType.ALL)
    private BookNo bookNo; //OneToOne

    //@JoinColumn(name = "bookTypess")
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(cascade=CascadeType.ALL)
    private BookType bookType;

    //@JoinTable(name="bookAuthorRelation",joinColumns={@JoinColumn(name="bookId")},inverseJoinColumns={@JoinColumn(name="authorId")})
    @ManyToMany(cascade=CascadeType.ALL)
    private List<Author> authorList;

   /* public Book() {
    }

    public Book(String name, double price, BookNo bookNo) {
        this.name = name;
        this.price = price;
        this.bookNo = bookNo;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BookNo getBookNo() {
        return bookNo;
    }

    public void setBookNo(BookNo bookNo) {
        this.bookNo = bookNo;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bookNo=" + bookNo +
                '}';
    }
}





