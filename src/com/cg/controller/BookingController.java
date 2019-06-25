package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




import org.springframework.web.bind.annotation.RequestParam;

import com.cg.service.IBookingService;

import entities.Booking;
import entities.HotelDetails;

@Controller
public class BookingController {

	@Autowired
	private IBookingService ibookingService;
	

	@RequestMapping("/hoteldetails.obj")
	public String getHomePage(Model model){
		model.addAttribute("hotelList",ibookingService.loadAll());
		model.addAttribute("hotel",new HotelDetails());
		return "HotelDetails";
	}
	
	@RequestMapping(value="/hotelbooking.obj")
	public String showBooking(@RequestParam String name, Model model)
	{
		model.addAttribute("hotel",new  HotelDetails());
		model.addAttribute("hotelname",name);
		return "hotelbooking";
	}
}

