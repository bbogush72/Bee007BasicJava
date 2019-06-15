package String2;

public class loopString {

	public static void main(String[] args) {
		String str = "Long day it is";
		
		for (int i = 0; i <= str.length(); i++) {
			//System.out.print(str.charAt(i)+ " ");
			
			System.out.println(str.substring(0, i));
		}

	}

}
