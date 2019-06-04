package day21;

public class GetUniqueChar {

	public static void main(String[] args) {
		String str = "AAccBBBdEEEf";

		String newStr = "";

		newStr = newStr + str.charAt(0);

		if (!newStr.contains(str.charAt(1) + " ")) {
			;
		
			newStr = newStr + str.charAt(1);}
		
		System.out.println(newStr);
		
	}

}
