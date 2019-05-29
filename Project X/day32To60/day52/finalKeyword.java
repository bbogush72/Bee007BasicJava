package day52;

class data {

	public final void method2() {
		System.out.println("Original");

	}

}

public class finalKeyword extends data {

//	@Override
//	public void method2() {
//		System.out.println("Override");
//	}
//	

	final static int b;

	static {
		b = 20;
	} // static block executed as soon as the class is loaded

	final int C;

//	public finalKeyword() {
//		C=90;
//	}

	{
		C = 100;
	}

	final double pi = 3.14;

	static public void main(String[] args) {

		final int a = 9;
		// a=10; // final cannt modified
		System.out.println();

		final int c;
		c = 10;
		System.out.println(c);

	}

	/*
	 * final: value cannot be modified applicable to variables, methods, class
	 * 
	 * variable: cannot re-assign it's value, instance variables MUST be initilized
	 * before use: if it's static: it can be initialized in static block if it's
	 * instance: it can be initialized either in constructor or in insitance block
	 * 
	 * 
	 * class: cannot be extended
	 * 
	 * method: method cannot be override
	 * 
	 * 
	 * 
	 * 
	 */

}
