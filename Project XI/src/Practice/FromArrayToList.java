package Practice;


import java.util.*;
import java.util.Arrays;
	
public class FromArrayToList {
	
	public static void main(String[] args) {
	obj a1 = new obj();
	ArrayList <obj> lst = new ArrayList<>();
	
		
		// create two single dim arrays
		int [] one = {1, 3,  5, 7 ,9};
		int [] two = {2, 4, 6, 8 };
		
		// get size of both arrays
		int lengthOne= one.length;
		int lengthTwo= two.length;
		for(int i=0; i<lengthOne; i++)
		{
	//	a1.arrayNum[i]= one[i];
		
		}
		for(int i=0; i<lengthOne; i++)
		{
//		 System.out.println(a1.arrayNum[i]);
		
		}
		
		
//		//new array size initialization
//		int  x =  lengthOne+lengthTwo;
//		
//		//create the 3rd array with the size of one and two
//		int [] three = new int[x];
//		
//		// copying first array into newly created array with the loop
//		for(int i=0; i<lengthOne; i++)
//		{
//			three[i]= one[i];
//		}
//		
//		System.out.println(Arrays.toString(three));
//		//because i does not represent size of array two, 
//		//it only represents size of index of array three
//		// c is the index of array two
//		int c=0;
//		
//		//copying the 2nd array into array three
//		for(int i=lengthOne; i<x; i++) 
//		{
//			three[i]= two[c];
//			c++;
//		}
//		System.out.println(Arrays.toString(three));
		
	}

}
