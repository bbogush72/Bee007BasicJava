package day32;

public class GiveMeLastChar1 {

	public static void main(String[] args) {
		giveMeLastChar("Snail");
		
		//store the value in char so you can access it again and manipulate
		char cLast=giveMeLastChar("Snail");
		System.out.println();
		
		//second to last char was stored now it can be manipulated
		System.out.println(cLast+ ""+ cLast);
	}
	
	public static char giveMeLastChar(String name) {
		char last = name.charAt(name.length()-2);
		// first char if you do this you cannot manipulate it again!
		//sort of one time print
		System.out.println(last); 
		return last;
	}

}
