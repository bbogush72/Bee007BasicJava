package mentoringResources;

import java.util.Arrays;

public class ArrayIntro1 {
	public static void main(String[] args) {
		
		//What is an array?
		// An array is like a container that stores certain type values.
		
		//30, 45, 22, 98, 10 ==> put these numbers in the array
		
		int numbers [];      //declare
		numbers= new int [5];// container holds 5 things
		
		
		//0 , 1 , 2, 3 , 4 ===> 5 items
		
		numbers[0]= 30; numbers [1]=45; numbers [2]= 22;
		numbers [3]= 98; numbers [4]= 10;
		
		// create the array the other way;
		//40, 55, 32, 88, 20
		int numbers2 [] = {40, 55, 32, 88, 20       }; 
		
		//Sort numbers and number2 items
		Arrays.sort(numbers);
		//System.out.println(numbers); // if we do this way we get a memory address,not we want this
		
		System.out.println(Arrays.toString(numbers)); // numbers sorted out smallest to largest.
		
		//=================================================================================================
		//                     0        1         2         3
		String [] Candies = {"Twix", "Crunch", "KitKat", "Hershey's"   };
		
		//find what is at indext one; Candies[1];
		System.out.println("Index 1: "+ Candies[1]);
		
		//Change KitKat with a new candybar;
		System.out.println("Index 2: "+ Candies[2]);
		
		Candies[2] = "butterfinger";
		
		System.out.println("Index 2: "+ Candies[2]); // what is found at index 2 after reassigned
		
		//Find length of the string and numbers2 arrays
		
		System.out.println("String length is: "+ Candies.length );
		
		System.out.println("Numbers2 lengths is: "+ numbers2.length);
	}
}
