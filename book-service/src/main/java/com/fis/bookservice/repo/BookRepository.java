package com.fis.bookservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.bookservice.entity.Books;

public interface BookRepository extends JpaRepository<Books, Long>{

	
}
