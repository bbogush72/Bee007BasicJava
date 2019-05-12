package day39;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList <Integer> nums = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		
		//ways to create List using the asList parameter
		//since we cannot add/remove, then copy everything to a new ArrayList object
		List <Integer> numsList = Arrays.asList(3,5,6,7,8,9);		
		List<Integer> numlist2 = Arrays.asList(3,5,6,7,5,4,3);		
		List <String> listStr = Arrays.asList("1", "2","3","4","5");
		
		
		
	}

}
