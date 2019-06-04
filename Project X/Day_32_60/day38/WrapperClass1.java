package day38;

public class WrapperClass1 {

	public static void main(String[] args) {

	//	Integer num = new Integer(100);
		
	//	doSomething(num);
		
	//	Integer x =100;
	//	doSomething(x);
	//	doSomething(100);
		
		doSomething(null);
		
		doSomething( Integer.valueOf(100));
		
		doSomething(Integer.parseInt("100"));
		
		
	}

	public static void doSomething(Integer num) {
		System.out.println("do something (Integer x)");
	}

	public static void doSomething(int x) {
		System.out.println("do something (int x)");
		
	}

}
