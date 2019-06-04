package day28;

public class ReverseInSTR {
	
	public static void main(String[] args) {
		
  String str = "Cybertek Batch Spartan is most hardworking Batch ever";
  String[] cyberTek = str.split(" ");  
  
  String one = "Cybertek" ; 
  char[] wordChars = str.toCharArray();
  int lastIndex = wordChars.length-1 ; 
  String reversedSentence = "";
  
  	for(int i=0; i<wordChars.length/2; i++) {
  		
  		char temp = wordChars[i];
  		wordChars[i] = wordChars[lastIndex-i];
  		
  		wordChars[lastIndex-i]= temp;
  		
  		
  	}
  
		String reversed = new String(wordChars);
		
		reversedSentence = reversedSentence + reversed + " ";
		
		System.out.println(reversedSentence);
		
		
		
		
		
	}

}
