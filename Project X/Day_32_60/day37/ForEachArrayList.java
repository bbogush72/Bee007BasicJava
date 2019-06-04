package day37;

import java.util.ArrayList;

public class ForEachArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Snail");
		list1.add("Mail");
		list1.add("Snail2");
		list1.add("Snail3");
		list1.add("nail2");
		list1.add("Snail4");
		
		for( String each : list1) {
			System.out.println(each);
		}

	}

}
