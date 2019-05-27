package chapter3;
import java.util.*;
public class StringBuilder {

	

	

	public static void main(String[] args) {
		int total = 0;
		String letters = new String("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		//total += letters.substring(5, 6).length();
		System.out.println(total);
	}

	

	

}
