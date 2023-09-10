package com.java.bookapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.bookapp.entity.Book;

public interface  BookRepo extends JpaRepository<Book, Integer>{

	  
}
