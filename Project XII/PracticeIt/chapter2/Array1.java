package chapter2;
public class Array1 {

	public static void main(String[] args) {

		//create array nums and assign 10 different numbers to it
		// search for a number 100 in it using a loop, once found print the index
		// location and "Value found at index  " + index
		// if that search value is not found print "100 is not found in the array"
		//once you find 100 then exit the loop at that point, we are looking for 
		//only first 100
		
		int [] nums = new int [] {1,3,67,34,55,1,1000,77,89,99,25};
		int lookfor = 100;
		//boolean found = false;
		char c = 't';
		
		for(int i =0; i<=nums.length-1 ; i++) {
			if (nums[i]==lookfor) {
				System.out.println(lookfor + " was found at index " + i);
				c='t';
				break;
		}
		}
		if(c !='a') {
				System.out.println("100 not found in the Array");
				
		}
	}
}