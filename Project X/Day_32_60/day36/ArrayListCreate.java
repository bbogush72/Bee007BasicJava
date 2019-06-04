package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCreate {

	public static void main(String[] args) {
		int i =10;
		Scanner in = new Scanner(System.in);
		
		Double d = new Double ("2.14");
		float f = 1.4f;
		
		//Create an  ArrayList object and assign it to list1
		ArrayList list1 = new ArrayList();
		
		//Create an ArrayList object with no arg constructor
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		
		
		list1.add("Go");
		list1.add("Snail");
		list1.add("Mail");
		list1.add("Go");
		list1.add(new Integer(1072));
		list1.add(Character.valueOf('A'));
		
		System.out.println(list1);
		
		//to print what's found in index 1 and 4 check out the following;
		String i1 = (String) list1.get(0); 
		String i2 = (String) list1.get(1); 
		
		Integer i3 =(Integer) list1.get(4);
		
System.out.println("let's print what are items at index 0, 1 and 4 in order");
		System.out.println(i2);
		System.out.println(i2);
		System.out.println(i3);
	}

}
