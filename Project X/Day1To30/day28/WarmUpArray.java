package day28;

import java.util.Arrays;

public class WarmUpArray {

	public static void main(String[] args) {
		/*
		 * 
		 * //Task1 : create an array of int with 5 items , return true if all items are
		 * more than 10 return false if not
		 * 
		 * //Task 2 : given : String str =
		 * "Cybertek Batch Spartan is most hardworking Batch ever";
		 * 
		 * use the method your learned to get each words and store it into String array:
		 * 
		 * loop through each items -- in each iteratrion loop : turn each word into char
		 * array print each char out with seperated by - output : C-y-b-e-r-t-e-k-
		 * B-a-t-c-h- S-p-a-r-t-a-n- i-s- m-o-s-t- h-a-r-d-w-o-r-k-i-n-g- o-n-e-
		 * e-v-e-r-
		 * 
		 * // Optional : Reverse each word in sentence your output should be ketrebyC
		 * hctaB natrapS si tsom gnikrowdrah eno reve
		 */
		int [] names2= {1, 2, 3, 4 , 5};
		System.out.println(Arrays.toString(names2));
		
		
		
		int count = 0;
		boolean result = count==5;
		
		for(int i =0; i< names2.length; i++) {
			
			if(names2[i]>=10) {
				
				System.out.println(result =true);
			}else {
				System.out.println(false);
			}
		}
		
	}

}
