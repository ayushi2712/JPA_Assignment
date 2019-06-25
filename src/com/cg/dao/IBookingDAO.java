package com.cg.dao;

import java.util.List;

import entities.Booking;
import entities.HotelDetails;

public interface IBookingDAO {

	public abstract List<HotelDetails> loadAll();
}
