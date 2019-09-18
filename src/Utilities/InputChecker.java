package Utilities;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class InputChecker {

	// to check whether the entered input is blank or not
	public static String getInputForFlightAttribute() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		while (true) {
			if (StringUtils.isBlank(inputString))
				System.err.print("Please enter the required input.");
			else if (!checkForSpecialCharacter(inputString)) {
				//do nothing
			} else
				break;
			inputString = sc.nextLine();
		}
		return inputString;
	}

	private static boolean checkForSpecialCharacter(String value) {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(value);
		boolean b = m.find();

		if (b) {
			System.err.println("No special characters allowed. Please enter again");
			return false;
		}
		return true;
	}
	
	// to check whether the entered input is blank or not
		public static String getInputForDate() {
			Scanner sc = new Scanner(System.in);
			String inputString = sc.nextLine();
			while (true) {
				if (StringUtils.isBlank(inputString))
					System.err.print("Please enter the required input.");
				 else
					break;
				inputString = sc.nextLine();
			}
			return inputString;
		}
}
