package day31;

import java.util.Arrays;

public class SimpleMethod {

	public static void main(String[] args) {
		
		/*
		 * methods: reusable  maintainable code, write once and use it whenever needed.
		 * 
		 * 3 questions to ask while creating a method:
		 * 1- Does the method need an object or not when being called?
		 * ===> if not we use static
		 * 
		 * 2- Does the method take external data or not?
		 * ===> if it doesn't, we just end method name with empty parenthesis ();
		 * ===> if yes, put the data type and name: parameters separated by comma
		 * 
		 * 3- does this method return a value after being called
		 * ===> if not use void;
		 * ===> if yes, put the data type of variable it returns
		 * 
		 */
		
		String s = "abc";
		System.out.println(s.charAt(0));
		
		int [] duck = {  1,2, 5, 6   };
		Arrays.sort(duck);
		
		for( int each : duck) {
			System.out.print(each + " - ");
		}
		System.out.println();
		
		arrayPrinterWithDash(duck);
		//create a static method with no return type
		// take one int array as parameter and print out in line with  - 
		
		
		
	}
	
	public static void arrayPrinterWithDash(int [] manyItems) {
			
		}
	
	

}
