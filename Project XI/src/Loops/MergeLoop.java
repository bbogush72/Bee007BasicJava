package Loops;

import java.util.Arrays;

public class MergeLoop {

	// Create a static method int array return type with two integer parameters
	public static int [] merger (int []a, int []b)
	{
		/** create an int type count to determine the size of arrays */
		int count =0;
		/** create a new array with the size of arrays a and b => use .length */
		int c[]= new int [a.length+ b.length];
		
		/** create a for loop to add all items of array a into array c */
		for(int i=0; i<a.length; i++)
		{	
		 	/** count++ will count at every iteration to find the size of array a
		 	  * and that way array c size will be the same with array a, then use 
		 	  * equality to copy all values to c array */
			c[count++]= a[i];
		}	
		/** create another for loop to add all items of array b into array c */
		for(int j=0; j<b.length; j++)
		{   
			/** count++ will count at every iteration to find the size of array b,
			 * then size of array c equal to size of array b, 
			 * then copy all values the same */
		  	c[count++]= b[j];
		}
		//since merger(int a, int b) method is a return type, return the array c 
		// array c should contain all values of array a and b
		return c;
	}
	
	
	
	public static void main(String[] args) {
		//
		int a[] = {1,2,4,5,6, 100};
		int b[] = {7,8,9,0};
		
		int c[] = new int[a.length+ b.length];
		
		System.out.println(Arrays.toString(merger(a,b)));
		
	}

}
