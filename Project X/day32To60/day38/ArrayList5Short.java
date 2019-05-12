package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList5Short {

	public static void main(String[] args) {
		
		//list of numbers that takes var arg of Integer
		//variable type must be List, because method return List not ArrayList
		//cannot add or remove an item; it generates unmodifiable list
		//update can work

		List<Integer> list = Arrays.asList(3,5,6,7,5,4,3);
		
		System.out.println(list);
		
		
		//list of words that takes var arg of Integer
		
		List <String> JLA = Arrays.asList("Superman", "Batman", "Wonder woman");
		System.out.println(JLA);
		
		//since we cannot add/remove, then copy everything to a new ArrayList object
		ArrayList<Integer> myList = new ArrayList<>(list);
		myList.add(100);
		myList.remove(Integer.valueOf(3));
		System.out.println(myList);
		
		//get a copy of JLA then you can add or remove
		
		//ArrayList<String> JLACopy= new ArrayList<>(); or
		 ArrayList<String> JLA1= new ArrayList <>(Arrays.asList("Superman", "Batman", "Wonder woman"));
		System.out.println(JLA1);
		JLA1.add("Flash");
		JLA1.add("Thanos");
		JLA1.remove("Thanos");
		System.out.println(JLA1);
		
	}

}
