package String2;

/*
 
Given two strings, a and b, 
create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, and so on. 
Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
public class mixString {

	public String mixString(String a, String b) {
		
		//create a new String str to copy a and b chars one by one
		String str = "";
		
		//because a, b length can be different, use Math.min(int1, int2)
		//create an int type and initialize Math.min method to find smaller size
		int min = Math.min(a.length(), b.length());
	//	int max = Math.max(a.length(), b.length());
		
		//create a for loop and change condition to i<min
		// why? Because min method gives us the lenght that is shorter
		for (int i = 0; i < min; i++) {
			
			// copy chars in string a and b into str; fill the empty string.
			str = str + a.charAt(i) + b.charAt(i);
		}
		//return str but there's leftover chars.
		//str.substring(num) gives the leftover chars
		return str + b.substring(min) + a.substring(min);
	}
}
