package day25;

import java.util.Arrays;

public class ArrayContain {

	public static void main(String[] args) {
		int cap[] = new int[50];
		
		for ( int i=0; i<=49; i++ ) {
			cap[i]=i+1;
			//System.out.println(cap[i]); // or
			
		}
		System.out.print(Arrays.toString(cap));
		

	}

}
