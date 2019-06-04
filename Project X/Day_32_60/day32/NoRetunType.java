package day32;

public class NoRetunType {

	public static void main(String[] args) {

		String name = "Ozlem";
		System.out.println(name.charAt(0));
		
		System.out.println(printSomething());
	}
	
	public static String printSomething() {
		System.out.println("Class ended, say wha, huh???");
		return null;
	}

}
