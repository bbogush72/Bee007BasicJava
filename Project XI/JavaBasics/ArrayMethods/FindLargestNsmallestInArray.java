package ArrayMethods;

public class FindLargestNsmallestInArray {

	public static void main(String[] args) {
	
		double [] myArray = {0.05, 2.5, 3.5, 4.5, 5.5 };
		double largest = myArray[0];
		
		//use for loop to find largest
		for (int i = 0; i < myArray.length; i++) 
		{
			if(myArray[i]> largest) largest = myArray[i];
		}
		System.out.println("Largest value is: " + largest);
		
		//use for each to find smallest
		double big = myArray[0];
		for(double each : myArray)
		{	
			if(each< big) big = each;
		}
		System.out.println("Smallest value is: "+big);
		
		// Java program to find smallest and second smallest elements
		double first;
		double second;
		//use Integer.MAX_VALUE;
		int myArraySize = myArray.length;
		
		//print invalid if input has less than 2 values
		if(myArraySize <2) System.out.println("input is invalid");
		
		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] <first)
			{
				second = first;
				first = myArray[i];
			}
			else if(myArray[i] < second && myArray[i]!= first)
			{
				second= myArray[i];
			}
			
		}
		
		if(second == Integer.MAX_VALUE)
		{
			System.out.println("No second element present");
		}
		else
			System.out.println("The smallest element: " + first + "\nThe smallest second element: "+ second );
		
		
	}

}
