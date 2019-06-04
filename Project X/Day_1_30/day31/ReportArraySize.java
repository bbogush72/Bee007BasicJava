package day31;

import java.util.Arrays;
import java.util.Scanner;

public class ReportArraySize {

	public static void main(String[] args) {
;
		Scanner in = new Scanner (System.in);
		
	int data1 [] = {1, 2, 3    };
	int	data2 [] = {1, 2, 3 , 5   };
		
		reportBiggerArray(data1, data2);
		reportBiggerArray(new int [] {1, 2, 7}, new int [] {44, 99}); // i think reassigned data1 and data 2 they are!!!
		
	
	}
	
	public static void reportBiggerArray (int[]data1, int []data2) {
		
		
		if(data1.length> data2.length) {
			System.out.println("Data1 array lenght is bigger");
		}else {
			System.out.println("Data2 array length is bigger");
		}
		
	}

}