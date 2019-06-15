package String2;

public class repeatEnd {
	/*
	 * 
	 * Given a string and an int n, return a string made of n repetitions of the
	 * last n characters of the string. You may assume that n is between 0 and the
	 * length of the string, inclusive.
	 * repeatEnd("Hello", 3) → "llollollo" 
	 * repeatEnd("Hello", 2) → "lolo"
	 * repeatEnd("Hello", 1) → "o"
	 */
	public static void main(String[] args) {

		repeatEnd r1 = new repeatEnd();
		System.out.println(r1.repeatEnd("Hello", 3));
	}

	public String repeatEnd(String str, int n) {

		String newStr = "";
		int lengthStr = str.length();
		String LocN = str.substring(lengthStr - n, lengthStr);

		for (int i = 0; i < n + 2; i++) {
			newStr = newStr + LocN;
		}

		return newStr;
	}
}
