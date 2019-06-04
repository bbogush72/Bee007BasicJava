package day28;

import java.util.Arrays;

public class ArrReverse {

	public static void main(String[] args) {
		
		String str = "Sunday Perfect Day to start coding";
		String strArr[]= str.split(" ");
		System.out.println(Arrays.toString(strArr));
		
		char[] sentenceChars = str.toCharArray(); 
		 String reverse = " ";
			    

		 for(int x =0 ; x<str.length(); x++) {
			    
			    for (int y = strArr[x].length()-1; y >=0; y--) {
			    	reverse =reverse + strArr[x].charAt(y);

			  String reversed =" ";
			  reversed = reversed+ reverse+" ";
			  
			 System.out.print(reversed);  
		 }  
			
		
	}
}
	
}