package com.Xworkz.Oops;

public class CinemaTicketBooking {
	String cinemaname;
	int ticketprice;
	int date;
	int time;
	int seat;
	
	public void payment() {
		System.out.println(" payment after booking slot");
	}
	public void notification() {
		System.out.println(" notification of time and date");
	}
	public void availability() {
		System.out.println(" Number of seat availability");
	}
}
