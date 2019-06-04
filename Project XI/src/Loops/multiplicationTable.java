package Loops;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number 1-10 ");
		int num =scan.nextInt();
		
		//check it is valid input 1-10
		if(num<1 || num>10)
		{
			System.out.println("Error: invalid input");
		//	return; //stop execution here
			System.exit(0); //stop execution
		}
		
		for(int i=1; i<=10;++i)
		{
			int result = num* i;
			System.out.println(num+ " x "+i+ " = "+ result);
		}
	}

}
