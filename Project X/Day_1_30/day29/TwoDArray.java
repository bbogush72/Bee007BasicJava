package day29;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		/*
		 * Task 1.1 : create 2D String array to represent below scenario( using any one
		 * of 3 way to create and assign value to array) 
		 * Task 1.2 : print out to see
		 * what’s inside using the Arrays class method 
		 * Task 1.3 print all the value
		 * inside using for loop 
		 * Task 1.4 print all the value inside using for loop and
		 * skip 3rd slice of pizza 
		 * Task 1.5 print all the value inside using for loop
		 * and stop eating when you see banana pepper
		 */

		String[][] pizza = { 
				{ "mushroom", "black olive", "red avocado" }, 
				{ "spinach", "green pepper", "mushroom" },
				{ "black olives", "black olive", "spinach" }, 
				{ "mushroom", "green", "red pepper" },
				{ "banana pepper", "spinach", "red pepper" }, 
				{ "mushroom", "green avocado", "green cola" },
				{ "spinach", "green pepper", "mushroom" } };

		System.out.println();
		System.out.println(Arrays.deepToString(pizza));
		System.out.println("[");
		for (String[] s1 : pizza) {

			for (String s2 : s1) {

				System.out.print(s2 + " ");
			}
			
		}
System.out.println("]");
//Task 1.4 print all the value inside using for loop and
//skip 3rd slice of pizza Task 1.5 print all the value inside using for loop

for (int i=0; i<pizza.length; i++) {
	System.out.println("Slice number :"+ i+1);
	
	if(i==2)
		continue;
	for(int j=0; j<pizza[i].length; j++) {
		
		System.out.println(pizza[i][j] + " | ");
	}
}


//ask 1.5 print all the value inside using for loop
//* and stop eating when you see banana pepper
for (int i=0; i<pizza.length; i++) {
	System.out.println("Slice number :"+ i);
	
	for(int j=0; j<pizza[i].length; j++) {
			if(pizza[i][j].equals("banana pepper")) {
				break;
	}
		System.out.println(pizza[i][j] + " | ");
		
	
}

	}

}
}