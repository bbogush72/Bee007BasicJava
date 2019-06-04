package day29;

import java.util.Arrays;

public class String2DArray {
public static void main(String[] args) {
	

	
	String [] data1 [] = new String [7][3];		
	String data2 [] [] = new String [7][3];
	String [] [] data = new String [7][3];
	
	data [0][0] = "mushroom";
	data [0][1] = "black olive";
	data [0][2] = "green pepper";
	data [1][0] = "spinach";
    data [1][1] = "green pepper";
    data [1][2] = "mushroom";							
    data [2][0] = "black olive";
	data [2][1] = "black olive";
	data [2][2] = "spinach";
	data [3][0] = "mushroom";
	data [3][1] = "mushroom";
	data [3][2] = "red pepper";
	data [4][0] = "banana pepper";
	data [4][1] = "spinach";
	data [4][2] = "red pepper";
	data [5][0] = "mushroom";
	data [5][1] = "green pepper";
	data [5][2] = "green pepper";
	data [6][0] = "spinach";
	data [6][1] = "green pepper";
	data [6][2] = "mushroom";
	
//Task 1.2 : print out to see what’s inside using the Arrays class method		
	
System.out.println(Arrays.deepToString(data));
	
//Task 1.3 print all the value inside using for loop
//Task 1.4 print all the value inside using for loop and skip 3rd slice of pizza
//Task 1.5 print all the value inside using for loop and stop eating when you see banana pepper

for (int i=0; i < data.length; i++) {
	System.out.println("Slice : "+i);
	
	for (int j=0; j<data[i].length; j++) {
		System.out.println(data[i][j]+ " ");
		
   if (data[i][j].equals("banana pepper")) {
			break;
		
	//String slice3= data[2][0];
              // if (data[i][j].equals(slice3) {
			//	continue;
}
   }
	}
}
}		



