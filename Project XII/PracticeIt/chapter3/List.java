package chapter3;


import java.util.ArrayList;


public class List {

	public static void main(String[] args) {
		//  List<String> list = new ArrayList<>(); 
		  ArrayList<String> list = new ArrayList<String>();
		   list.add("one"); 
		   list.add("two"); 
		  // list.add(7); 
		  for(String s : list)  System.out.print(s);

	}

}
