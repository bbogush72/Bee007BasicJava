package day30;

public class MethodWithParameters {

	public static void main(String[] args) {


//		String s = "abc";
//		System.out.println(s.substring(1, 3));
		
		//printTheSum(10.5,20.9);
		printTheSum(10.5,20.9);
		printTheSum(110.5,202.9);
		printTheSum(55,2);
	}
	
	public static void printTheSum(double a, double b) { 
		
		double sum = a+b;
		System.out.println("Sum of a and b is: "+ sum);
	}

}
