package day38;

import java.util.Scanner;

public class ZillowTester {

	public static void main(String[] args) {
		// what comes after new keyword is called constructor
		// Scanner in = new Scanner(System.in);
		Zillow house1 = new Zillow();
		house1.type = "Single Family Home";   //have 3 house objects and 4 parameters
		house1.squareFeet = 1500.5d;
		house1.year = 1985;
		house1.roomNumber = 2037;
		house1.totalCost=300000.00;

		Zillow house2 = new Zillow();

		house2.type = "Apartment";
		house2.squareFeet = 1600.5d;
		house2.year = 1987;
		house2.roomNumber = 2038;
		house2.totalCost=150000.00;

		Zillow house3 = new Zillow();

		house3.type = "Condo";
		house3.squareFeet = 900.0d;
		house3.year = 1995;
		house3.roomNumber = 2039;
		house3.totalCost=200000.00;
		 //gives error, hashcode that is the memory address in the heap
		System.out.print(house1.type+" - "+ house1.roomNumber+" - "+house1.squareFeet+" - "+house1.year+" - "+house1.totalCost);
		System.out.println();
		System.out.print(house2.type+" - "+ house2.roomNumber+" - "+house2.squareFeet+" - "+house2.year+" - "+house2.totalCost);
		System.out.println();
		System.out.print(house3.type+" - "+ house3.roomNumber+" - "+house3.squareFeet+" - "+house3.year+" - "+house3.totalCost);
	}

}
