package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import Utilities.GetInput;
import Utilities.InputChecker;
import Utilities.ReadFile;
import Utilities.SetTimer;
import models.Flight;

public class Main {

	public static List<Flight> existingFlights;

	public static void main(String[] args) {

		Timer timer = SetTimer.setTimerForUpdatingCSVFiles();
		try {
			Thread.sleep(500);
			Flight flight = GetInput.getInputFromUser();
			FindFlights.findListOfFlights(flight);
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			timer.cancel();
		}
	}

}
