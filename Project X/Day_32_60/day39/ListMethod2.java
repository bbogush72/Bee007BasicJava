package day39;

import java.util.ArrayList;
import java.util.List;

public class ListMethod2 {

	public static void main(String[] args) {
// create a message that accept a string object and add four items in it

		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("kiwi");
		list.add("orange");

		printItems(list);
		// printItems(list);

		System.out.println(getListFrom(10));
		System.out.println(getListFrom(20));
	}

	public static void printItems(List<String> strList) {

		for (int i = 0; i < strList.size(); i++) {
			System.out.print(strList.get(i) + " - ");
		}
		System.out.println();
	}

	// create a method accepts a number as ending point and return List of Integer
	// from 1 - to that number
	public static ArrayList<Integer> getListFrom(int x) {
		
		
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= x; i++) {
			numList.add(i);
		}
		return numList;
	}

}
