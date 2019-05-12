package day36;


import java.util.ArrayList;

public class ArrayListExamples2 {
	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();
		values.add("Apple");
		values.add("Pear");
		values.add("Kiwi");
		System.out.println(values);
		
		values.remove("Apple");
		System.out.println(values);
		values.add(1, "Orange");
		System.out.println(values);
		System.out.println("Size: "+values.size());
	}
}