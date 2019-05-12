package Chapter1;

import java.util.Arrays;

public class ArrayContentComparison {

	public static void main(String[] args) {

		int outer[] = {1,2,3,4,2,3,7,8,2,3};
		int inner[]= {2,3};
		int count=0;
		
//		Arrays.sort(inner);
//		Arrays.sort(outer);
		boolean IsThere=false;
		
		for(int i=0;i<outer.length-1;i++)
		{
			
		  if(outer[i]==inner[0]&& outer[i+1]==inner[1]) {   // 0 1 
		  IsThere=true;
		  count++;
		  }
		}
		System.out.println(IsThere);
		System.out.println("occurence count: "+ count);
	}

}
