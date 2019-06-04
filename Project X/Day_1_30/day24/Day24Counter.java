package day24;

public class Day24Counter {

	public static void main(String[] args) {
		// count 1 to 20 and get the sum of all numbers
		int sum=0;
		for(int i=1; i<=20; i++) {
			
			sum=sum+i;
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.print("Sum of 1-20: "+sum);

	}

}
