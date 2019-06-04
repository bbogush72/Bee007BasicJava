package day33;

public class SumStatic {

	public static void main(String[] args) {

	System.out.println(getSum());	
	
	System.out.println(concatAll());
	}
	
	public static int getSum() {
		
		int a = 5;
		int b = 10;
		int c= 15;
		
		int d = a+b+c;
		return d;
		
	}
	
	public static String concatAll() {
		
		String a = "Nice day";
		String b= "Long day";
		String c= "Next day";
		String d = ""+ a+" "+b+" "+c; 
		return d;
		
		
	}
	

}
