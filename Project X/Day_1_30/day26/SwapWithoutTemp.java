package day26;

public class SwapWithoutTemp {

	public static void main(String[] args) {

		int num1 = 100;
		
		System.out.println("num1 was: " + num1);
		
		int num2 = 200;
		
		System.out.println("num2 was: " + num2);
		
		num1 = num1 + num2;

		num2 = num1 - num2;
		
		System.out.println("num2 now is: "+num2);
		
		num1= num1-num2;
		System.out.println("num1 now is: "+num1);
	}

}
