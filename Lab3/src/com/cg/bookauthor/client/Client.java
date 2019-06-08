package com.cg.bookauthor.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookauthor.entities.Author;
import com.cg.bookauthor.entities.Book;

public class Client
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
	
		Book romance = new Book();
		romance.setId(300);
		romance.setTitle("Half Girlfriend");
		romance.setPrice(300);

		Author auth1 = new Author();
		auth1.setName("Chetan Bhagat");
		
		auth1.addBook(romance);
		em.persist(auth1);

		System.out.println("Added books along with book details to database.");

		transaction.commit();
		em.close();
		factory.close();
	
	}
}