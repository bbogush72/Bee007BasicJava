package day32;

import java.util.Random;

public class GiveMeBiggerNumber {

	public static void main(String[] args) {
		
		
			System.out.println(GiveMeBiggerNumber());
	}

	public static byte GiveMeBiggerNumber() {
		
		Random Number = new Random();
		int num1 = Number.nextInt(15000*29) + 100;
		
		
		Random Number2 = new Random();
		int num2 = Number.nextInt(15000*17) + 1000;
		
		if(num1>num2) {
			System.out.println("num1 is greater: "+num1);
		}else if(num1==num2) {
			System.out.println("tevafuk this is, no place for coincedence ");
		}else {
			System.out.println("num2 is greater: "+num2);
		}
		
		//int max = num1 > num2 ? num1 : num2;
		return 0;
	}

}
