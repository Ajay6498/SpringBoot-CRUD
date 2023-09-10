package com.java.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

 
import com.java.bookapp.entity.Book;
import com.java.bookapp.service.BookService;

@Controller
public class BookController {
    
	@Autowired
	private BookService bookService;
	
	@GetMapping("/addbook")
	public String addBooks(Model model) {
		model.addAttribute("book", new Book());
		return "addbook";
	}
	@PostMapping("/added")
	public String added(Model model, Book book) {
		Boolean status= bookService.saveBook(book);
		if (status == true) {
			model.addAttribute("msg", "Book Added Successfully");

		} else {
            model.addAttribute("msg", "Failed");
		}
		
		return "success";
	}
	@GetMapping("/showbook")
	public String showBooks(Model model,Book book) {
		List<Book> books = bookService.getAllBook();
		model.addAttribute("show", books);
		return "showbooks";
	}
	
	
	
}
