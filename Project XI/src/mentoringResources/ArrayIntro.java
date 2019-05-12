package mentoringResources;

import java.lang.reflect.Array; // get access to classes static methods
import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		/* Array : is a container that stores a sequence of values - same type.
		 * Each item in an array is tied to numerical index.
		 * 
		 * 
		 */
		
		//30, 45, 22, 98, 10
		
		int [] numbers; // only declared array 
		numbers=  new int [5]; // now we added the size
		
		numbers[0]=30; 
		numbers[1]=45; 
		numbers[2]=22; 
		numbers[3]=98; 
		numbers[4]=10; 
		
		//create array one one single line
		int [] numbers2 = {30, 45, 22, 98, 10}; // declare, allocate and initialize
		
		Arrays.sort(numbers); // sort the numbers in the array
		
		System.out.println(numbers );//we get a memory address because array is a reference type
		System.out.println(Arrays.toString(numbers)); // a way to directly print what's sorted
		
		//now now, let's create a String array in one single line and access index 1 that holds Twix;
		String [] CandyBars = {"Hershey's", "Twix", "Crunch", "KitKat"};
		
		System.out.println("Index 1: "+ CandyBars[1]); // accessing index 1 
		
		CandyBars[2]= "Butterfinger"; // reassigning another variable to index 2
		
		System.out.println("Length: "+ CandyBars.length); // finding the length of CandyBars
		
		System.out.println(Array.get(CandyBars, 2)); // get specific index 

	}

}
