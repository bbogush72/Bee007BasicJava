package repel1;

import java.util.Scanner;

public class Rep149 {

	public static void main(String[] args) {
		// Input: 07:05:45PM --> change it to military hour.
		// Output: 19:05:45
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		String[] sNew = s.split(":"); // 07 05 45PM = made array
		int miliPmHours = 0;
		char[] myChar = sNew[2].toCharArray(); // 4 5 P M
		boolean isFound = sNew[2].contains("PM");
		if (isFound == true) { // if(isFound) will do the same trick
			int pmHrs = Integer.parseInt(sNew[0]); // to access digits in the String input
			miliPmHours = pmHrs + 12; // for example 6:00PM will become 18:00
			System.out.println(miliPmHours + ":" + sNew[1] + ":" + myChar[0] + myChar[1]);
		} else {
			System.out.println(sNew[0] + ":" + sNew[1] + ":" + myChar[0] + myChar[1]);
		}

	}

}
