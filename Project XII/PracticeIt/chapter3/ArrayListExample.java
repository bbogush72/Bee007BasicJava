package chapter3;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <String> lst = new ArrayList<>();
		
	//	lst.remove(0);
		
		ArrayList <String> lst1 = new ArrayList<>();
		
		lst1.add("ab");
		lst.add("ab");
		
		if(lst.equals(lst1))
		{
			System.out.println(true);
		}
		else
		{
			
		}
	}

}
