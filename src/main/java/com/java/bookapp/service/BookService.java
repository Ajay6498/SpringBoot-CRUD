package com.java.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.bookapp.dao.BookRepo;
import com.java.bookapp.entity.Book;

 @org.springframework.stereotype.Service
public class BookService implements Service {
@Autowired
	private BookRepo bookRepo;
	
	@Override
	public Boolean saveBook(Book book) {
	Book save=	bookRepo.save(book);
		 if (save.getBookId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Book> getAllBook() {
		
		return bookRepo.findAll();
	}

	
}
