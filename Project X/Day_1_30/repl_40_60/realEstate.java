package repl_40_60;

import java.util.*;

public class realEstate {
  public static void main(String[] args) {
    //DO NOT CHANGE
    int propertyPrice = 0; 
		int numberOfBedrooms; int garageSpots=0;
		float metroAccessibility=0; float schoolScore; float highwayAccessibility=0;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
    //WRITE YOUR CODE HERE
    
    System.out.println("Enter your property type:");
		houseType = scan.nextLine();
		
		if(houseType.equals("Single Family Home")) {
			propertyPrice=95000;}
		else if(houseType.equals("Condo")) {
			propertyPrice=50000;}
		else if(houseType.equals("Townhouse")) {
			propertyPrice = 75000;}
		
		System.out.println("How many bedrooms do you have?");
		
		numberOfBedrooms =scan.nextInt();
		if(numberOfBedrooms ==1) {
			propertyPrice+=30000;}
		else if(numberOfBedrooms ==2) {
			propertyPrice+=60000;}
		else if(numberOfBedrooms ==3) {
			propertyPrice+=90000;}
		else if (numberOfBedrooms == 4) {
			propertyPrice += 120000;}
		else if (numberOfBedrooms == 5) {
			propertyPrice += 150000;}
		else if (numberOfBedrooms == 6) {
			propertyPrice += 180000;}
		else if (numberOfBedrooms == 7) {
			propertyPrice += 200000;}
		else if (numberOfBedrooms == 8) {
			propertyPrice += 240000;}
			else if (numberOfBedrooms == 9) {
			propertyPrice += 270000;}
			else if (numberOfBedrooms == 10) {
			propertyPrice += 300000;}
			else if (numberOfBedrooms == 11) {
			propertyPrice += 330000;}
			
		//System.out.println("checkpoint total cost"+propertyPrice);
		
		System.out.println("Do you have a backyard?");
		backyard = scan.nextBoolean();
		
		if(houseType.equals("Condo")) {
			System.out.println("Backyard is not available for condo!");}
		else if(houseType.equals("Single Family Home")) {
			propertyPrice += 5000;}
		else if(houseType.equals("Townhouse")) {
			propertyPrice += 5000;}	
		
		//System.out.println("checkpoint total cost "+propertyPrice);
		
		System.out.println("Do you have garage?");
		garage=scan.nextBoolean();
		
		if(garage==true) {
			propertyPrice+=0;
		}
		
		System.out.println("How many spots?");
		garageSpots= scan.nextInt();
		if(garageSpots ==1) {
			propertyPrice+=20000;}
		else if(garageSpots==2) {
			propertyPrice+=40000;}
		else {
			System.out.println("Pardon, it's not a public parking!");}
		
		System.out.println("How close is metro station?");
		metroAccessibility=scan.nextFloat();
		if(metroAccessibility<1) {
			propertyPrice+=10000;}
		else if(metroAccessibility>=1 && metroAccessibility<=3) {
			propertyPrice+=5000;}
		else if(metroAccessibility>=5)  {
			propertyPrice+=4000;}
		
			
		
		System.out.println("How close is highway?");
		highwayAccessibility=scan.nextFloat();
		if(highwayAccessibility<1) {
			propertyPrice+=15000;}
		else if(highwayAccessibility>1 && highwayAccessibility<5) {
			propertyPrice+=8000;}
		else if(highwayAccessibility>5) {
			propertyPrice+=4000;}
			//System.out.println("checkpoint total cost "+propertyPrice);
			
			System.out.println("What's the rating of nearest school?");
			
			schoolScore = scan.nextInt();
			if(schoolScore>=8 && schoolScore<=10) {
				propertyPrice+=45000;}
			
			else if(schoolScore<8) {
				propertyPrice+=20000;}
				else{propertyPrice+=5000;}
			
			System.out.println("Does any of your family members smoking?");
			smoking=scan.nextBoolean();
			
			if(smoking == true) {
				propertyPrice-=5000;}
				else if(smoking == false){propertyPrice+=5000;}
				
			System.out.println("Market report has been generated.");
			System.out.println("Your estimate market price is: "+propertyPrice+"$");
	}
}
