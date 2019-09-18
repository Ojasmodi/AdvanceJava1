package models;

import java.util.Date;

public class Flight {

	private String flightNumber;
	private String departureLocation;
	private String arrivalLocation;
	private Date validityOfFlight;
	private String flightTime;
	private double FlightDuration;
	private double fare;
	private boolean seatAvailability;
	private String flightClass;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public Date getValidityOfFlight() {
		return validityOfFlight;
	}

	public void setValidityOfFlight(Date validityOfFlight) {
		this.validityOfFlight = validityOfFlight;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public double getFlightDuration() {
		return FlightDuration;
	}

	public void setFlightDuration(double flightDuration) {
		FlightDuration = flightDuration;
	}

	public boolean isSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(boolean seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
}
