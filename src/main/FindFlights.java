package main;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

import Utilities.FareComparator;
import Utilities.FlightTimeComparator;
import Utilities.InputChecker;
import Utilities.Constants;
import models.Flight;

public class FindFlights {

	// method to list all flights based on user input
	public static void findListOfFlights(Flight flight) {
		List<Flight> resultedFlights = new ArrayList<>();
		String inputValue;
		Iterator iterator = Main.existingFlights.iterator();
		while (iterator.hasNext()) {
			Flight tempFlight = (Flight) iterator.next();
			if ((flight.getArrivalLocation()).equals(tempFlight.getArrivalLocation())
					&& (flight.getDepartureLocation()).equals(tempFlight.getDepartureLocation())
					&& (tempFlight.getValidityOfFlight().compareTo(flight.getValidityOfFlight()) > 0)
					&& tempFlight.isSeatAvailability()) {
				if (flight.getFlightClass().equalsIgnoreCase("b") && tempFlight.getFlightClass().contains("b")) {
					tempFlight.setFare(tempFlight.getFare() * Constants.BUSINESS_CLASS_MULTIPLIER);
					resultedFlights.add(tempFlight);
				} else if (flight.getFlightClass().equalsIgnoreCase("e")) {
					resultedFlights.add(tempFlight);
				}
			}
		}
		if (resultedFlights.isEmpty()) {
			System.out.println("No flights available for the given criteria.");
		} else {
			System.out.println("Enter output preference number.-\n 1.By Fare\n 2.By both Fare and flight duration.");
			while (true) {
				inputValue = InputChecker.getInputForFlightAttribute();
				if (inputValue.equals("1") || inputValue.equals("2")) {
					break;
				} else
					System.err.println("Invalid preference. Please enter your choice again.");
			}
			Collections.sort(resultedFlights, new FareComparator());
			if (inputValue.equals("2"))
				Collections.sort(resultedFlights, new FlightTimeComparator());
			System.out.println("Flight number|Fare(Rs)|Time(24:00)|Duration(Hrs)");
			for (Flight f : resultedFlights)
				System.out.println(f.getFlightNumber() + "|" + Math.round(f.getFare()) + "|" + f.getFlightTime() + "|"
						+ f.getFlightDuration());
		}
	}

}
