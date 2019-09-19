package com.jy.book.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookType {

    @Id
    @GeneratedValue
    private Long id;

    private String typeName;

    private String typeFeature;

    //@OneToMany(cascade= CascadeType.ALL,mappedBy = "bookType")  //
    //private List<Book> bookList;

    public BookType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeFeature() {
        return typeFeature;
    }

    public void setTypeFeature(String typeFeature) {
        this.typeFeature = typeFeature;
    }

   /* public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }*/


}
