package String2;


public class repatSeparator {
	/*
	 * 
	 * Given two strings, word and a separator sep, return a big string made of
	 * count occurrences of the word, separated by the separator string.
	 * 
	 * 
	 * repeatSeparator("Word", "X", 3) → "WordXWordXWord" 
	 * repeatSeparator("This","And", 2) → "ThisAndThis" 
	 * repeatSeparator("This", "And", 1) → "This"
	 */
	public static void main(String[] args) {
		repeatSeparator("Word", "X", 3);
//		System.out.println(repeatSeparator("Word", "X", 3));
//		System.out.println(repeatSeparator("This", "And", 2));
//		System.out.println(repeatSeparator("This", "And", 1));
//		
//		System.out.println(repeatSeparator("Hi", "-n-", 2));
	}

	public static String repeatSeparator(String word, String sep, int count) {
//		if you add "word" here, then remove the word added to the concat at the return
//		String concat = ""+word; 
		String concat = "";
		if(count == 0) { return ""; }
		for (int i = 1; i <count; i++) {
			concat = concat+ word + sep;
		}
		return concat + word;
	}

}
