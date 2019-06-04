package day35;

public class MethodOverLoading {

	public static void main(String[] args) {

		//Can I use the same method name for different methods?
		//yes, that is called method overloading.
		//Overloading means reusing the name of methods with different
		//parameters
		
		printName();
		printName2(" in java");
		
		printName3(" in Java", "SnailMail");
	}
	
	public static void printName() {
		System.out.println("Method overloading");
	}
	public static void printName2(String name) {
		System.out.println("Method overloading"+ name);
	}
	public static void printName3(String firstName, String lastName) {
		System.out.println("Method overloading"+ firstName +" "+ lastName);
	}
}
