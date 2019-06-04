package Loops;

import java.util.*;

public class Register {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome, how many items are you purchasing today?");
		
		int itemsCount = keyboard.nextInt();
		double totalPrice = 0.0;
		String items = "";
		
		for(int count = 1; count <= itemsCount; count++) {
			System.out.println("What is item "+count + "?");
			String itemName = keyboard.next();
			
			System.out.println("How much is " + itemName + "?");
			double itemPrice = keyboard.nextDouble();
			//add itemName to items and itemPrice to totalPrice
			items += itemName + ", ";
			totalPrice += itemPrice;	
		}
		if(items.endsWith(", ")) {
			//get rid of that ", "
		}
		System.out.println("Your items: " + items);
		System.out.println("Your total Price: $" + totalPrice);
	}
}


