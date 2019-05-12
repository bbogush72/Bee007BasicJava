package day36;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		//Autobox the value i
		Integer i = 100;
		//Adding items
		numList.add(i);
		numList.add(i+50);
		numList.add(i+150);
		numList.add(i+200);
		System.out.println(numList);
		
		//Getting single item from ArrayList
		numList.get(0);
		System.out.println(numList.get(0));
		
		int i2 = numList.get(1); // auto unboxed 
		Integer i3 =numList.get(1); //auto boxed
		
		System.out.println(i2);
		System.out.println(i3);
	}

}
