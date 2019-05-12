package day30;

import java.util.Scanner;

import day29.Methods;

public class Utility {

	public static void main(String[] args) {
		//printUsersInput(); or 
		//for (int i = 1; i < 4; i++) {
		printUsersName();
		printUsersName();}

	//}
	//
	public static void printUsersName() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter names");
		
		String name = scan.next();
		System.out.println("You entered: "+name);
		
		Methods.doYourTask(name);
		
	}
		
	
	
}
