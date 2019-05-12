package day30;

import java.util.Scanner;

public class DoubledNumCheckAge {

	public static void main(String[] args) {

		/*
		 * Task 2 /* 2.1 create a static method with no return type called
		 * printTheDoubledNumber it takes 1 int as parameter and it will print out
		 * doubled number on the console
		 * 
		 * 2.2 create another static method with no return type called checkForAge it
		 * takes 1 int age as parameter inside body , check whether the age is more than
		 * 18 if the age is more than 10 --> print adult if not print not an adult
		 * 
		 */
		printTheDoubledNumber(0);
		checkForAge(0);
		
	}

	// public is access modifier
	public static void printTheDoubledNumber(int i) { // int i is a method parameter
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		i=scan.nextInt();
		
		
		System.out.println("input value is now doubled: " + (i += i));
	}

	public static void checkForAge(int age) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		age=scan.nextInt();
		if (age > 18) {
			System.out.println("GrownUp");
		} else

			System.out.println("Being a kid afar");
	}

}
