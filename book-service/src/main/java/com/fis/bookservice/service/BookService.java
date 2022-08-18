package com.fis.bookservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.bookservice.entity.Books;
import com.fis.bookservice.repo.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository repo;

	public List<Books> getBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}
