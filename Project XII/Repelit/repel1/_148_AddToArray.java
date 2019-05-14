package repel1;
import java.util.*;
import java.util.Arrays;

public class _148_AddToArray {

	public static void add_to_r(int[] r, int n) {
	/*
	 * the method creates a new array bigger by one then (int[] r). It populates the
	 * new array with the old ones(r) values. and finally in the last position adds
	 * the number (int n) to it. method input: add_to_r(new int{1,5,77,8} ,2)
	 * outputs (int array): [1, 5, 77, 8, 2]
	*/
	// create a new array with one more position
		int[] new_r = new int[r.length + 1];
		for(int i=0; i<r.length; i++)
		{
			new_r[i]= r[i];
		}
			new_r[new_r.length-1]=n;
			System.out.println(Arrays.toString(new_r));
		
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		//create two 
		int size = in.nextInt(), n= in.nextInt();
		int [] arr = new int [size];
		for(int i=0; i<=size-1; i++)
		{
			arr[i]=in.nextInt();
			
		}
		add_to_r(arr,n);
	}

}
