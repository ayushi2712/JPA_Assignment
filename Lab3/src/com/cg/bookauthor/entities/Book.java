package com.cg.bookauthor.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;
	

	@Id
	private int id;
	private String title;
	private double price;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private Set<Author> authors = new HashSet<>();// for creating the set of
													// authors

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}
