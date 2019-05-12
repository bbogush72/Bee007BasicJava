package Practice;
import java.util.Arrays;
public class ArrayPractice1 {

	public static void main(String[] args) {
		
		// There are three ways to create arrays.
		
		//first way array
		String str [] = new String [3];
		str[0]=""; 
		str[1]="";
		str[2]="";
		
		//second way array
		String str2 [] = new String [] { "abc", null, "def", "ghi"};
		System.out.println("str2 array size is: "+str2.length); // find size of the second way array
		
		int str3 [] = new int [] { 2, ' ', 5, 7}; // if you add null in int data type, there's error. But char can be placed.
		System.out.println("str3 array size: "+str3.length); 
		
		//last way array
		String [] str4 = {"ice cream", "sorbet", "island way", "sherbet"};
		
		System.out.println(Arrays.toString(str4)); // str4 printed in one line in string format.
		/*
		for(int i=0; i< str4.length; i++) {    //Print all array items using for loop
			System.out.print(str4[i]+" - ");*/
		
		int x=0; //Print all array items using while loop
		
		while(x<str4.length) {
			System.out.print(str4[x]+ " ");
			x++;
		}
		}
		
	}


