package com.TM.spring.jpa;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.sql.Time;
import java.sql.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@Column(name = "reservationID")
	private int reservationID;
	
	@Column(name = "firstname")
	@NotBlank(message = "Firstname cannot be empty.")
	private String firstname;

	@Column(name = "lastname")
	@NotBlank(message = "Lastname cannot be empty.")
	private String lastname;
	
	@Column(name = "passengers")
	private int passengers;
	
	@Column(name = "flightclass")
	@NotBlank(message = "Flight classs cannot be empty.")
	private String flightclass;
	
	@Column(name = "phonenumber")
	private long phonenumber;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "dateofdeparture")
	private String dateofdeparture;
	
	public Reservation( ) { }
	
	public Reservation(
			int reservationID, int passengers,
			String flightclass, long phonenumber,
			String time, String dateofdeparture
			) {
		this.reservationID = reservationID;
		this.passengers = passengers;
		this.flightclass = flightclass;
		this.phonenumber = phonenumber;
		this.time = time;
		this.dateofdeparture = dateofdeparture;
	}
	
	
	public int getReservationID() {
		return this.reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID; 
	}

	
	
	public int getPassengers() {
		return this.passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers; 
	}
	
	

	public String getFirstname() {
		return this.firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname; 
	}
	
	
	public String getLastname() {
		return this.lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname; 
	}
	
	
	
	public String getFlightclass() {
		return this.flightclass;
	}
	public void setFlightclass(String flightclass) {
		this.flightclass = flightclass; 
	}
	

	
	public long getPhonenumber() {
		return this.phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber; 
	}
	

	
	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time; 
	}

	public String getDateofdeparture() {
		return this.dateofdeparture;
	}
	public void setDateofdeparture(String dateofdeparture) {
		this.dateofdeparture = dateofdeparture; 
	}
}