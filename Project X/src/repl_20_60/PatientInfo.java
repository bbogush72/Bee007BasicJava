package repl_20_60;

import java.util.Scanner;

public class PatientInfo {
  public static void main(String[] args) {
    //Enter your code here
		String firstName; String lastName; String fullName;

		String email; String street; String state;

		String city; String address; String contacts;
	    
		int age; int zipcode;
		
		boolean isMarried;
		
		long workPhoneNumber; long personalPhoneNumber;
		
		double height; double weight;
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    
	    System.out.println("Enter your first name");
	    firstName = scan.nextLine();
	    
	    System.out.println("Enter your last name");
	    lastName = scan.nextLine();
	    
	    System.out.println("Enter your email");
	    email = scan.nextLine();
	    
	    System.out.println("Enter your street");
	    street = scan.nextLine();
	    
	    System.out.println("Enter your city");
	    city = scan.nextLine();
	    
	    System.out.println("Enter your state");
	    state = scan.nextLine();
	    
	    System.out.println("Enter your zip code");
	    zipcode = scan.nextInt();
	    
	    System.out.println("Enter your work phone number");
	    workPhoneNumber = scan.nextLong();
	    
	    System.out.println("Enter your personal phone number");
	    personalPhoneNumber = scan.nextLong();
	    
	    System.out.println("Enter your age");
	    age = scan.nextInt();
	    
	    System.out.println("Enter your height");
	    height = scan.nextDouble();
	    
	    System.out.println("Enter your weight");
	    weight = scan.nextDouble();
	    
	    System.out.println("Are you married?");
	    isMarried = scan.nextBoolean();
	    
System.out.println("Patient personal information" + "\nFull name: " + lastName + ", " + firstName + 
	    		"\nAddress: " + street + ", " + city + ", " + state + " " + zipcode +
 	    		"\nContacts: " + "work phone number - " + workPhoneNumber + ", " +"personal phone number - "
	    		+ personalPhoneNumber + ","
	    		+ " email: " + email + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds" + 
	    		"\nMarried?: " + isMarried);
    
  }
}