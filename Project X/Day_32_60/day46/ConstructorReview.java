package day46;

public class ConstructorReview {

	public ConstructorReview() {
		// this(10);
		System.out.println("deafult constructor");

	}

	public ConstructorReview(int u) {
		// ConstructorReview(); contsror methods cannot be called through method name
		this(); // this ( ) is used to call constructor methods in current class

		// this(9.8); // constructor method can only call one constructor method

	}

	public ConstructorReview(double u) {

		System.out.println("deafult constructor");
		// this(); constructor call needs to in the first line

	}

	/*
	 * Every class MUST have constructor method, if no contructor is created,
	 * compiler will create default constructor (also no-arg constructor).
	 * 
	 * custom method: Access-modifier specifier return-type methodname optional
	 * optional required required
	 * 
	 * 
	 * Constructor: Access-modifier MethodName ( parameter ) optional Required
	 * optional
	 * 
	 * Method name: has to be same with class name Access-Modifier: supports all
	 * access modifiers Parameter: can be any class, object, primitives. if there
	 * isn't any, the constructore will be deafult
	 * 
	 * 
	 * constructor cannot have: specifier, return-type specifers: static
	 * return-type: void, primitives, wrapperclass, and objects
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void methodName() {
		// ConstructorReview( 10 ); contsructor method cannot be called in the methods
		System.out.println("hello");
		method2();

	}

	public static void method2() {

	}

}
