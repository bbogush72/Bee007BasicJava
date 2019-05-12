package day25;

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
// swap a and b values without using a third value or temp.
// First add a and b and assign it to a
		
// Second do a minus b assign it to b
// Last do a minus b assign it to a

		int a= 5;
		System.out.println("value of a is: "+a);
		int b=10;
		System.out.println("value of b is: "+b);
		
		a= a+b; // a=15  
		
		b= a- b; // while b equals 10,  15-10 returns 5, assign it to b =5
		System.out.println("value of b is: "+b);
		
		a= a-b; // a is 15, 15- 5 =10 assign it to a =10
		System.out.println("value of a is: "+a);

	}

}
