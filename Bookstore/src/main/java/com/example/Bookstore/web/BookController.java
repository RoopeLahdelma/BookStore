package com.example.Bookstore.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Bookstore.domain.Book;



public class BookController {
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String Books(Model model, Book book) {
		
		
		return "index";
	}
}
