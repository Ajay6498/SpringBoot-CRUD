package com.java.bookapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
@Id
private int bookId;
private String bookName;
private String bookAuthor;
private Double bookPrice;

public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public Double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(Double bookPrice) {
	this.bookPrice = bookPrice;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
			+ bookPrice + "]";
}
public Book(Integer bookId, String bookName, String bookAuthor, Double bookPrice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	this.bookPrice = bookPrice;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}



}
