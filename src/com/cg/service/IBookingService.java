package com.cg.service;

import java.util.List;

import entities.Booking;
import entities.HotelDetails;


public interface IBookingService {

	public abstract List<HotelDetails> loadAll();
}
