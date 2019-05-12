package Loops;

public class NestedLoopArray {

	public static void main(String[] args) {
		// write a program to get unique characters from a string
		//aaabbccc==> abc
		
		String str = "aaabbccc";
		
		String newStr = "";
		
		for(int i=0; i< str.length(); i++) {
			
			String eachChar= str.substring(i, i+1);
			if(! newStr.contains(eachChar)) {   //(newStr.contains(eachChar==false)
				newStr+=eachChar;
				System.out.print(eachChar);
			}
			
		}

	}

}
