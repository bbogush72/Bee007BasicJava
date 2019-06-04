package day20;

public class ForLoopCountName {

	public static void main(String[] args) {

		String name = " loop is faster";

		int count = name.length();

		for (int i = 0; i < count; i++) {
			System.out.print(name.charAt(i) + " ");
		}

		System.out.println(name.substring(0).toUpperCase());
		
		
		for (int i = count -1; i>=0; i--) {
			
			System.out.print(name.charAt(i)+ " ");
		}
	}

}
