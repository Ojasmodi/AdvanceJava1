package Utilities;

import java.util.Timer;
import java.util.TimerTask;

import main.Main;

public class SetTimer {
	
	public static Timer setTimerForUpdatingCSVFiles() {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Main.existingFlights = ReadFile.readCSVFiles();
			}
		};
		Timer timer = new Timer();
		long delay = Constants.DELAY_IN_READING_FILES;
		long intervalPeriod = Constants.INTERVAL_FOR_READING_CSV_FILES;
		// schedules the task to be run in an interval
		timer.scheduleAtFixedRate(task, delay, intervalPeriod);
		return timer;
	}

}
