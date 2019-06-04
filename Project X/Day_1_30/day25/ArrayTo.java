package day25;

import java.util.Arrays;

public class ArrayTo {

	public static void main(String[] args) {
		int odd[] = new int[50];
		
		for ( int i=0; i<=49; i+=2 ) {
			odd[i]=i+1;
			System.out.println(odd[i]); // or
			
		}
		
		//System.out.print(Arrays.toString(odd));

	}

}
