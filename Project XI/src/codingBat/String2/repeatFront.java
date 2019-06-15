package String2;

public class repeatFront {
	/*
	 * 
	 * Given a string and an int n, return a string made of the first n characters
	 * of the string, followed by the first n-1 characters of the string, and so on.
	 * You may assume that n is between 0 and the length of the string, inclusive
	 * (i.e. n >= 0 and n <= str.length()).
	 * repeatFront("Chocolate", 4) → "ChocChoChC" 
	 * repeatFront("Chocolate", 3) →"ChoChC" 
	 * repeatFront("Ice Cream", 2) → "IcI"
	 */
	public static void main(String[] args) {
		repeatFront r1 = new repeatFront();
		System.out.println(r1.repeatFront("Chocolate", 4));
		System.out.println(r1.repeatFront("Ice Cream", 2));
		
	}

	public String repeatFront(String str, int n) {
		  //int size = str.length();
		  String newWord = "";
		  
		  for (int i = n; n > 0; n--){
		    newWord += str.substring(0,n);
		  }
		  return newWord;
		}


}
