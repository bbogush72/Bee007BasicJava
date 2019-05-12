package day24;

public class ArraySum {

	public static void main(String[] args) {
		int nums []= {1,4,6,4,8,5,9};
		
		int sum =0;
		
		for (int i=0; i<nums.length; i++) {
			
			sum = sum + nums[i];
		}
		System.out.println(sum);
		

	}

}
