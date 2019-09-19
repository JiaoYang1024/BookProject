package com.jy.book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookType {

    @Id
    private Long id;

    private String typeName;

    private String typeFeature;

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


}
