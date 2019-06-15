package String2;

public class starOut {
	/*
	 * 
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its left and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad".
	 * 
	 * 
	 * starOut("ab*cd") → "ad" 
	 * starOut("ab**cd") → "ad" 
	 * starOut("sm*eilly") →"silly"
	 * starOut("sm***eil*ly") → "siy" 
	 * starOut("stringy*") → "string"
	 * starOut("*stringy") → "tringy" 
	 * starOut("*str*in*gy") → "ty" 
	 * starOut("abc") →
	 * "abc" starOut("a*bc") → "c" 
	 * starOut("ab") → "ab" 
	 * starOut("ab*cd") → "ad" "ad"
	 * OK starOut("ab**cd") → "ad" "ad" OK 
	 * starOut("sm*eilly") → "silly" "silly" OK
	 * starOut("sm*eil*ly") → "siy" "siy" OK 
	 * starOut("sm**eil*ly") → "siy" "siy" OK
	 * starOut("sm***eil*ly") → "siy" "siy" OK 
	 * starOut("stringy*") → "string"
	 * "string" OK starOut("*stringy") → "tringy" "tringy" OK 
	 * starOut("*str*in*gy")→ "ty" "ty" OK 
	 * starOut("abc") → "abc" "abc" OK 
	 * starOut("a*bc") → "c" "c" OK
	 * starOut("ab") → "ab" "ab" OK 
	 * starOut("a*b") → "" "" OK 
	 * starOut("a") → "a" "a"
	 * OK starOut("a*") → "" "" OK 
	 * starOut("*a") → "" "" OK 
	 * starOut("*") → "" "" OK
	 * starOut("") → "" "" OK 
	 * other tests OK
	 * 
	 */
	public static void main(String[] args) {
		starOut s1 = new starOut();
		// System.out.println(s1.starOut("ab*cd"));
		System.out.println(s1.starOut("sm*eil*ly"));
		System.out.println(s1.starOut("*str*in*gy"));
		System.out.println(s1.starOut("abc"));
		System.out.println(s1.starOut("ab*cd"));
	}

	public String starOut(String str) {

		// return str.replaceAll("(.?[*]+.?)", "");
		String word = "";
		boolean currentFlag = false;

		if (str.length() == 0)
			return word;

		for (int i = 0; i + 1 < str.length(); i++) {
			if (str.charAt(i) == '*') {
		
				i += 1;
				currentFlag = true;
				continue;		
			}
			if (str.charAt(i + 1) == '*') {
				i += 2;
				continue;
			}
			if ((i > 0) && str.charAt(i - 1) == '*') {
				continue;
			}
			word += str.substring(i, i + 1);
			currentFlag = false;

		}

		if (!(currentFlag) && (str.length() == 3) && (str.charAt(1) == '*'))
			return "";

		if ((str.charAt(str.length() - 1) != '*') & !(currentFlag))
			return word += str.charAt(str.length() - 1);
		else
			return word;
	}
}