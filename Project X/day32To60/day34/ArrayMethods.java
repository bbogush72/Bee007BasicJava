package day34;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {

		//create a static method, getArrayFrom1toX
		// one parameter and return array start from 1 to x
		
		int x = 9; //or we can add the scanner class to make it dynamic
		int [] result = getArrayFrom1toX(x);
		System.out.println(Arrays.toString(getArrayFrom1toX(x)));
		System.out.println(Arrays.toString(getArrayFrom1toX(8)));
		
		//Int to string by storing it with a String type
		String ariString = Arrays.toString(getArrayFrom1toX(7));
		System.out.println(ariString);
		
		System.out.println(Arrays.toString(getArrayFrom1toX(6)));
		System.out.println(Arrays.toString(getArrayFrom1toX(5)));
		System.out.println(Arrays.toString(getArrayFrom1toX(4)));
		System.out.println(Arrays.toString(getArrayFrom1toX(3)));
		System.out.println(Arrays.toString(getArrayFrom1toX(2)));
		System.out.println(Arrays.toString(getArrayFrom1toX(1)));
	}
					//method			//1 parameter: int x
	public static int [] getArrayFrom1toX(int x) {
		
		int ari []= new int [x];
		
		for (int i=0; i<ari.length; i++) {
			ari[i]=i+1;
		}
		
		
		return ari;
		
	}

}
