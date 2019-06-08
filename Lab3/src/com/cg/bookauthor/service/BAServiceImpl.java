package com.cg.bookauthor.service;

import java.util.List;

import com.cg.bookauthor.dao.BADao;
import com.cg.bookauthor.dao.BADaoImpl;
import com.cg.bookauthor.entities.Book;

public class BAServiceImpl implements BAService {

	private BADao dao;

	public BAServiceImpl() {
		dao = new BADaoImpl();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBooksInPriceRange(double min, double max) {
		// TODO Auto-generated method stub
		return dao.getBooksInPriceRange(min, max);
	}

}
