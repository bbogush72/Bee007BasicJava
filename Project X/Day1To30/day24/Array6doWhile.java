package day24;

public class Array6doWhile {

	public static void main(String[] args) {
		
		int nums[] = { 1, 4, 6, 4, 8, 5, 9 };

		int sum = 0;
		
		int j=0;
		
		do {
			sum=sum+ nums[j];
			j++;
		}while(j<nums.length);
		
		System.out.println(sum);
	}

}
