package Arrays;

/**
Reads 7 temperatures from the user and shows which are above
and which are below the average of the 7 temperatures.
*/
import java.util.Scanner;

public class ArrayOfTemperatures {
	public static void main(String[] args) {
		double[] temperature = new double[7];
// Read temperatures and compute their average:
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 7 temperatures:");
		double sum = 0;
		
		for (int index = 0; index < 7; index++) 
		{
			temperature[index] = keyboard.nextDouble();
			sum = sum + temperature[index];
		}
		double average = sum / 7;
		System.out.println("The average temperature is " + average);
// Display each temperature and its relation to the average:
		System.out.println("The temperatures are");
		
		for (int index = 0; index < 7; index++) 
		{
			if (temperature[index] < average)
				System.out.println(temperature[index] + " below average");
			else if (temperature[index] > average)
				System.out.println(temperature[index] + " above average");
			else // temperature[index] == average
				System.out.println(temperature[index] + " the average");
		}
		System.out.println("Have a nice week.");
	}
}
