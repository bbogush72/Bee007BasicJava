package day21;

public class Continue {

	public static void main(String[] args) {
		for (int num = 0; num < 51; num++) {
int sum= 0;
			if (num % 2 == 0) {
				continue;

			}
			System.out.print(num +" ");
sum = sum+num;
		System.out.println(sum);}

		for (int num1 = 0; num1 < 50; num1++) {

			if (!(num1 % 4 == 0)) {
				continue;

			}
				
			//System.out.println();
			
			System.out.print(num1);
		
		}
	}
}