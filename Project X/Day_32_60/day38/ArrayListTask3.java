package day38;

import java.util.ArrayList;

public class ArrayListTask3 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Superman");
		list1.add("Batman");
		list1.add("Green Lantern");
		list1.add("Iron Man");
		
		
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Hulk");
		list2.add("Flash");
		list2.add("Ant Man");
		list2.add("Aquaman");
		
		
		//add list2 to list 1
		//list1.addAll(list2);
		System.out.println("List 1 contains: "+list1);
		System.out.println("List 2 contains: "+list2);
		
		//inserting all of list2 items at index 0
		list1.addAll(0, list2);
		System.out.println(list1);
		
		
		//create another arraylist and assing the other arraylist
		
		ArrayList<String> list3 = new ArrayList<>(list1);
		System.out.println("Heroes: "+ list3);
		
		
		//How to get string representation of ArrayList object; implicit behavior
		System.out.println(list3.toString());
	}

}
