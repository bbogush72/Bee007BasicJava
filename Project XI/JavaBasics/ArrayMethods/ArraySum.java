package ArrayMethods;

public class ArraySum {

	public static void main(String[] args) {
		//create an int or double type myArray and sum and initialize given values
		// sum =0d and myArray has 12, 14, 16, 18 , 20.9
		double sum =0d;
		double myArray [] = { 12, 14, 16, 18 , 20.9 };
		
		//use classic for loop to add up all values
		for (int i = 0; i < myArray.length; i++) 
		{
			sum = sum + myArray[i];
		}
		System.out.println("Total value by for loop: " + sum);
		
		System.out.println();
		
		//use for each loop to add up all values
		double sum2 = 0d;
		for(double each : myArray)
		{
			sum2 = sum2 + each;
		}
		System.out.println("Total value by for each: "+sum2);
		
	}

}
