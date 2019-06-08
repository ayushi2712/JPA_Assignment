package com.cg.bookauthor.service;

import java.util.List;

import com.cg.bookauthor.entities.Book;

public interface BAService {
	public abstract List<Book> getAllBooks();
	public abstract List<Book> getAuthorBooks(String author);
	public abstract List<Book> getBooksInPriceRange(double min, double max);
}
