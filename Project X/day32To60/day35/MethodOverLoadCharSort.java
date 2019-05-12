package day35;

import java.util.Arrays;

public class MethodOverLoadCharSort {

	public static void main(String[] args) {

		String name = "Snail Mail";
		char [] nameChars = name.toCharArray(); // String name==> char array
		String [] nameStr = name.split(""); // String name ==> String array
		
		System.out.println(Arrays.toString(nameChars));
		System.out.println();
		System.out.println(Arrays.toString(nameStr));
		
		Arrays.sort(nameStr);//sorted String Array
		System.out.println(Arrays.toString(nameStr));
		
		System.out.println();
		
		Arrays.sort(nameChars);//sorted char Array
		System.out.println(Arrays.toString(nameChars));
		
		add(10);
		add(10L);
		
		int i=10;
		add(i);
		
	}
	public static void add(int x ) {
	    System.out.println("int x "+ x);
	  }
	  
	  
	  public static void add(long x) {
	    System.out.println("long x "+ x);
	  }
	  //did not find a way to call short value
	  public static void add(short x) {
		    System.out.println("short x "+ x);
		  }

	}


