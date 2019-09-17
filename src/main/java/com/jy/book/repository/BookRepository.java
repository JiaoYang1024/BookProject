package com.jy.book.repository;

import com.jy.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book,Long> {


    List<Book> findByName(String name);

    List<Book> findByPrice(double price);

    List<Book> findByPriceOrPrice(double price, double price1);

    List<Book> findByNameAndPrice(String name, double price);

    List<Book> findByNameOrderByPriceAsc(String name);

    @Query(nativeQuery = true,value = "select * from book where price = :price or price = :price1")
    List<Book> findByPriceInSql(@Param("price") double price,@Param("price1") double price2);

}
