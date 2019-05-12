package Chapter1;

import java.util.Scanner;

public class CalcMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		Addition(num1, num2, '+');
		Subtraction(num1, num2, '-');
		Division(num1, num2, '/');
		
		Multiplication(num1, num2, '*');
		ModularDivision(num1, num2, '%');
	

	}public static void ModularDivision(int num1, int num2, char mychar) {
		int mod = num1%num2;
		
		System.out.println("ModularDivision of num2 from num1 : "+ mod);
		
	}public static void Multiplication(int num1, int num2, char mychar) {
		System.out.println("Multiplication of num2 from num1 : "+ (num1*num2));
	}

	
	
	public static void Addition(int num1, int num2, char mychar ) {
		int sum = num1+num2;
		System.out.println("Sum of num1 and num2 : "+ sum);
		
	}
	
	public static void Subtraction(int num1, int num2, char mychar){
		
		System.out.println("Subtraction of num2 from num1 : "+ (num1-num2));
		
	}
	
	public static void Division(double num1, double num2, char mychar) {
		double division = num1/num2;
		System.out.println("Division of num2 from num1 : "+ division);
		
		
	}
}
