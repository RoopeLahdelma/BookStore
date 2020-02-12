package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookStoreApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}


@Bean
public CommandLineRunner BookDemo(BookRepository repository) {
	return (args) -> {
		log.info("save a couple of books");
		repository.save(new Book("Memoriam", "Marc Maclemore", 2001, 21939321, 20.20));
		repository.save(new Book("Willy Wonka", "Todd Harper", 2012, 20039321, 30.12));
		repository.save(new Book("Java Coffee and why to buy it", "Anthony Bertnard", 1992, 10039321, 15.50));
		
		
		
		log.info("fetch all Books");
		for (Book book : repository.findAll()) {
			log.info(book.toString());
		}

	};
}
}

