package repel1;

/**Create a method that:  is called twoTimes
	returns a new ArrayList of Integers
	takes in a single parameter - an ArrayList of Integers

	This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

	For example, if the parameter is
	(1,5,3,7)
	The method should return a new ArrayList of Integers with
	(1,1,5,5,3,3,7,7) */

import java.util.ArrayList;

public class MethodsWithArrayList {
	public static void main(String[] args) {

		ArrayList <Integer> list = new ArrayList<>();
		twoTimes(list);
		
	}
	// create your method below

	public static  String twoTimes(ArrayList<Integer> num) {
		num = new ArrayList<Integer>();
		ArrayList <Integer> num1 = new ArrayList<>();
		
		for (int i=0; i< num.size(); i++)
			for(int j=0; j<num.size(); j++)
			
			num1.add(i+j);
//			System.out.println(num1.toString());
			
			
		
		return num1.toString();
		
	}

}