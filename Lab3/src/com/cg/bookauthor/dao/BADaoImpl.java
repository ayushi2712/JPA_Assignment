package com.cg.bookauthor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.bookauthor.entities.Book;


public class BADaoImpl implements BADao {


	private EntityManager entityManager;

	public BADaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}  
	
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getBooksInPriceRange(double min, double max) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :min and :max";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", min);
		query.setParameter("high", max);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

}
