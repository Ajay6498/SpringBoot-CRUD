package com.java.bookapp.service;

import java.util.List;

import com.java.bookapp.entity.Book;

public interface Service {
public Boolean saveBook(Book book);
public List<Book> getAllBook();
}
