package day24;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int [ ] nums =new int [10];
		
		int i= rand.nextInt();
		System.out.println(i);
		
		for(int j=0; j<10; j++) {
			
			nums[j]= rand.nextInt(1000);
			
			
			
			
		}
		System.out.println(Arrays.toString(nums));
		

	}

}
