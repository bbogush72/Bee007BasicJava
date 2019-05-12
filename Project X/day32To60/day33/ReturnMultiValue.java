package day33;

import java.util.Arrays;

public class ReturnMultiValue {

	public static void main(String[] args) {
		
		int myArray[]= giveMeAnArray();
		//System.out.println(Arrays.toString(myArray));
		
		System.out.println(Arrays.toString(myArray));
	}
	
	//this method take no parameter and return int array object as returned value
	public static int[] giveMeAnArray() {
		
		System.out.println("Action ");
		int [] arr = new int [] {1,2,3};
		return arr;
	}

}
