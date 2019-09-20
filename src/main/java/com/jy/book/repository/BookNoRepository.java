package com.jy.book.repository;

import com.jy.book.entity.BookNo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookNoRepository extends JpaRepository<BookNo,Long> {
}
