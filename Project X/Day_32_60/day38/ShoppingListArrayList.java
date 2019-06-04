package day38;

import java.util.*;
import java.util.ArrayList;

import java.util.List;

public class ShoppingListArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		List<String> list2 = new ArrayList<>();

		list.add("Lemonade");
		list.add("Orange Juice");
		list.add("Mango");
		list.add("Sprite");
		list.add("Club Soda");
		list.add("Apple juice");
		list.add("BlueBerry");
		list.add("KIWI");
		System.out.println(list);
		
		//get single items from the list
		System.out.println("How many items: "+ list.size());
		
		//getting single items
		
		System.out.println("Get the single items at 2: "+ list.get(2));
		

		// update or change an item
		list.set(0, "vinegar");
		System.out.println(list);

		// insert an item
		list.add(1, "Milk");
		System.out.println(list);

		// check if something exists in the list
		boolean haveMilk = list.contains("Milk");
		System.out.println("Any milk in the list: " + haveMilk);

		System.out.println("any milk lowercase: " + list.contains("milk"));

		// check the location of something
		int indexOfMango = list.indexOf("Mango");
		System.out.println("index of mango is at: " + indexOfMango);

		// remove something from the list
		System.out.println(list);
		list.remove("vinegar");
		System.out.println(list);

		list.remove(4);
		System.out.println(list);
		list.remove("BlueBerry");
		System.out.println(list);

		// when using remove(object) version of the method
		// if we dont have the item it remain the same
		list.remove("KIWI");
		System.out.println(list);
		// index has to be within range or it will throw Exception
		// myList.remove(100);
		// System.out.println(myList);

		// deleting all from the list
		//list.clear();
		//System.out.println(list);

		// chekcing the list is empty or not
		System.out.println("checking the list is empty or not : " + list.isEmpty());
		
		//getting all contents using classic for loop and for each loop next
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i)+ " - ");
		}
		System.out.println();
		
		for( String each : list) {
			
			System.out.print(" | item : "+ each);
		}
	}

}
