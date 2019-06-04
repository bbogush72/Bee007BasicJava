package day34;

import java.util.Arrays;

public class VarArgsString {

	public static void main(String[] args) {

		printNames("Snail", "Pillbug", "Bird", "cat", "fish");
		
		printNames("Dragon", "Fly", "Dragonite", "Flyonite");
	}
	
	public static void printNames(String ...myFavoritePets) {
		//names will be like String []
		
		//print/access directly individual names
		System.out.println(myFavoritePets[0]);
		System.out.println(myFavoritePets[2]);
		System.out.println(myFavoritePets[3]);
		
		//access, print all directly
		System.out.println(Arrays.toString(myFavoritePets));
		System.out.println();
		
		//find size of the input
		int length = myFavoritePets.length;
		System.out.println("The size of the input is: "+length);
		
		
		
	}

}
