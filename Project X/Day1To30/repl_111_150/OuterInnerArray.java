package repl_111_150;

import java.util.*;

public class OuterInnerArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);//=======================
		//WRITE YOUR CODE HERE
		boolean inner1=false;
		boolean outer1=false;
		
		// iteration 1: we check inner[0]/first element of inner is equal to outer[0] first element of outer
		// iteration 1: inner [1]/second element of inner is equal to outer[1] second element of outer
		// iteration 2: inner [0] first element of inner is equal to outer[1] second element of outer 
		// iteration 2: inner [1] first element of inner is equal to outer[2] third element of outer 
		// iteration 3: inner [0] first element of inner is equal to outer[2] third element of outer 
		// iteration 3: inner [1] first element of inner is equal to outer[3] fourth element of outer 
		for(int k=0;k<sizeOuter-1;k++)
		{
		  if(outer[k]==inner[0]&& outer[k+1]==inner[1])    // 0 1 
		  inner1=true;
		}
//		for(int z =0; z<sizeOuter; z++){ // 1
//		   
//		    
//		    if(outer[z]==inner[1]){
//		        outer1=true; 
//		    }
//		}
//		if(inner1==true&& outer1==true){
//		    System.out.println("true");
//		}else
		System.out.println(inner1);
		
		
		
  }
}
