package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import entities.Booking;
import entities.HotelDetails;
@Repository
public class BookingDAOImpl implements IBookingDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<HotelDetails> loadAll() {
		TypedQuery<HotelDetails> query = entityManager.createQuery(
				"SELECT e FROM HotelDetails e", HotelDetails.class);
		return query.getResultList();
	}
}
