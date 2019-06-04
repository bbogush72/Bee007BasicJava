package day24;

public class ArrayGetMax {
	public static void main(String[] args) {
		
	
	int nums[] = { 1, 4, 6, 4, 8, 5, 9 };

	int max = nums[0];
	
	for (int i=0; i<nums.length; i++) {
		
		if(nums[i]>max) {
			max =nums[i];
		}
	}
	System.out.println("highest number is : "+max);
	
	
	
}
	
	
}
