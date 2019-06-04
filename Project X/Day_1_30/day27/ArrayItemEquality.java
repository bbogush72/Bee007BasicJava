package day27;

public class ArrayItemEquality {

	public static void main(String[] args) {
		int [] arr1 = { 1, 3, 4, 65, 2};
		int [] arr2 = { 1, 3, 4, 65, 2};
		int[] arr3 = {3,1,4,65,2} ; 
		
		
	
		int n = 0;
	//	boolean bool = arr1[1] == arr2[1];
		
		for (int i= 0; i<arr1.length; i++) {
			
			for(int j=i; j<arr2.length; j++) {
				
				
				if(arr1[i]==arr2[j]) {
				n = arr1[i];
				
				boolean bool = arr1[i] == arr2[j];
				System.out.println(bool);
				}
				
			}

			
		}
		
	}

}
