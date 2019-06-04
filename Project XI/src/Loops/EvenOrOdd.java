package Loops;

public class EvenOrOdd {
	public static void main(String[] args) {
		
	
	//use loops to count 1 to 100
	//print all even numbers in the same line
	
	for(int n=1; n<=100; n++)
	{
		if(n%2==0) 
		{
			System.out.print(n+ " ");
		}
	}
	System.out.println();
	
	//print all odd numbers in the same line
	for(int n=1; n<=100; n++)
	{
		if(n%2!=0)
		{
			System.out.print(n+ " ");
		}
	}
	
	//get sum of 1 to 100 of odds and evens
	
	int sumofOdds =0; int sumofEvens=0;
	for(int n=1; n<=100; n++)
	{
		if(n%2==0)
		{
			sumofEvens+=n;
		}
		else
		{
			sumofOdds+=n;
		}
	}
	System.out.println();
	System.out.println("Sum of evens:" + sumofEvens);
	System.out.println("Sum of odds:" + sumofOdds);
	

	
	}	
}
