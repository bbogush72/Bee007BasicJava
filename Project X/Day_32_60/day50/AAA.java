package day50;

public class AAA extends AA {
	public static void main(String[] args) {

		AAA a = new AAA();
	}

	public AAA() {
		super();
		System.out.println("AAA constructor");
	}

}

class AA extends A {

	int num;

	public AA() {
		super();// explicit
		System.out.println("AA constructor");
	}
}

class A {
	public A() {
		// super(); even if you don't put super() here, it's there implicitly
		System.out.println("A constructor");
	}

}
