package day28;

public class LostBoysArrayReverse {

	public static void main(String[] args) {
		//reverse each word and concatenate them reversed
		
		String words = "I'm a lost kid from a cyberLand, usually hanging out with neither can't, run run lost boy";
		
		String [] wordsNoSpace = words.split(" ");
		
		char[] wordChars = words.toCharArray();
		
		int lastIndex = wordChars.length -1;
		
		String reversed ="";
		
		for(int i=0; i<wordChars.length/2; i++) {
			char temp = wordChars[i];
			
			wordChars[i]= wordChars[lastIndex-i];
			
			temp = wordChars[lastIndex -i];
			
		}
			
		String reversedStr = new String (wordChars);
			reversed = reversed +reversedStr + " ";
		
		System.out.println(reversed);
	}

}
