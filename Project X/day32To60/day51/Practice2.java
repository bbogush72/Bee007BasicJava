package day51;

public class Practice2 {

	protected String str = "Cybertek school";
	// access modifier is default

	protected void method1() {
		System.out.println(str);
	}

	public final void method() {
		System.out.println("overloaded");
	}

	public final void method(int a) {
		System.out.println("overloaded");
	}
}
