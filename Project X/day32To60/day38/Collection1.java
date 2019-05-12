package day38;

import java.util.ArrayList;

import java.util.Collections;

public class Collection1 {
	public static void main(String[] args) {

		// collection utility class
		// have many static methods perform common array operations
		// Arrays.sort(ArrayObject);

		// Collections is a class under java.util package performs collection operations

		ArrayList<String> list = new ArrayList<String>();

		list.add("Snail");
		list.add("Termite");
		list.add("Fly");
		list.add("Tiger");
		list.add("Starling");
		list.add("Ecoli");

		System.out.println("Before: " + list);
		Collections.sort(list);//================>alphaNumeric sort done here
		System.out.println("After: " + list);
		
		// look for an item index after the sort
		int snailIndex = Collections.binarySearch(list, "Snail");
		System.out.println("index of snail: " + snailIndex);
		// sort method from ArrayList expect an object called Comparator
		// since we don't know the type of object, we do know any reference variable can
		// be set to null
		// so we can pass null to this method
		
		//find index of Fly
		int flyIndex = Collections.binarySearch(list, "Fly");
		System.out.println("index of Fly: "+ flyIndex);
		
		//reverse in collection utility
		Collections.reverse(list);
		System.out.println("reverses list: "+ list);
		
		//shuffle all the contents at every run
		Collections.shuffle(list);
		System.out.println(list);
	}
}
