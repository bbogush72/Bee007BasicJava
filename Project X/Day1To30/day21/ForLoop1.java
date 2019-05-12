package day21;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ben";
		
		String result = " ";
		
		String result2 = " ";
		
		for (int i = 0; i < str.length(); i++) {

			result = result + str.charAt(i);

		}
		System.out.print(result + "*");

		System.out.println(" ");

		for (int k = str.length() - 1; k > -1; k--) {

			result2 = result2 + str.charAt(k);

		}
		System.out.print(result2 + "*");
	}

}
