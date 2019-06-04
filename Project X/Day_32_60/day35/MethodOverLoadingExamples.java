package day35;

public class MethodOverLoadingExamples {
//method overloading use same method with different parameters
	public static void main(String[] args) {

		String name = "java";
		System.out.println(name.indexOf("a")); //first a index shows @1
		System.out.println(name.indexOf("a",2));//second a index @3
		
		System.out.println(name.replace('a', 'b'));  //replace a's with b's
		System.out.println(name.replace("va", "java")); //va is replaced with java
		
		System.out.println();
	}

}
