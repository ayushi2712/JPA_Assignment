package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IBookingDAO;

import entities.Booking;
import entities.HotelDetails;
@Service
@Transactional
public class BookingServiceImpl implements IBookingService {

	@Autowired
	private IBookingDAO ibookingDAO;

	@Override
	public List<HotelDetails> loadAll() {

		return ibookingDAO.loadAll();
	}
}
