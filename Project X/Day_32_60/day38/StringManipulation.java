package day38;

public class StringManipulation {

	public static void main(String[] args) {
				   // 0123456789
		String str = "JavaScript";
		String reversed = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i);
			
		}
		System.out.println(reversed);
	
	}

}
