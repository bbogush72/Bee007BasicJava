package repl_40_60;

import java.util.*;

public class apartmentLeasing {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    int numberOfBedrooms = scan.nextInt();
    int startingPrice=0;
    //WRITE YOUR CODE HERE
    
   if (numberOfBedrooms==1) {
		      startingPrice = 1100;		      
		         System.out.println("One Bedroom Selected");
		         System.out.println("Starting Price: "+startingPrice);
		         
		      }
		else if(numberOfBedrooms ==2) {
		        startingPrice =1850;
		        System.out.println("Two Bedroom Selected");
		        System.out.println("Starting Price: "+startingPrice);
		      }
		      
		    else if(numberOfBedrooms ==3) {
		    	startingPrice= 2550;
		System.out.println("Three Bedroom Selected");
		System.out.println("Starting Price: "+startingPrice);
		      }
		    else {
		    	System.out.println("No such Bedrooms available");
		    	 System.out.println("Starting Price: "+startingPrice);
		    }

}}
