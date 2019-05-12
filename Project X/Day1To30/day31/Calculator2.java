package day31;
 import java.util.Arrays;
import java.util.Scanner;
public class Calculator2 {

	public static void main(String[] args) {
	
		 		Scanner input = new Scanner(System.in);
		 		System.out.println("Enter a num:");
		 		int a = input.nextInt();
		 		System.out.println("Enter a num:");
		 		int b = input.nextInt();
		 		addition(a,b);
		 		subtraction(a,b);
		 		multiplication(a,b);
		 		division(a,b);
		 		
	}
		 	
		 	public static void addition(int a, int b) {
		 		int sum = a + b;
		 		System.out.println("The sum of the two number is: " + sum);
		 	}
		 	public static void subtraction(int a, int b) {
		 		int minus = a-b;
		 		System.out.println("The subtraction result is: " + minus);
		 	}
		 	public static void multiplication(int a, int b) {
		 		int multiplication = a * b;
		 		System.out.println("The multiplication result is: " + multiplication);
		 	}
		 	public static void division(double a, double b) {
		 		double division = a/b;
		 		division = Math.round(division);
		 		System.out.println("The division result is: " + division);
		 	}
		
	

}
