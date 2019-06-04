package day26;

import java.util.Arrays;

public class charToArray1 {

	public static void main(String[] args) {

		String str1 = "Hayrulla Muattar";
		char[] nameChars = str1.toCharArray();

		System.out.println(Arrays.toString(nameChars));

		String str2 = ""; //

		for (int i = 0; i < nameChars.length; i++) {

			char c = nameChars[i];
			str2 = str2 + c;
			// System.out.print(c + " ");
		}
		System.out.println(str2);

		// String str2 = new String( nameChars ) ;
		
//    

	}

}
