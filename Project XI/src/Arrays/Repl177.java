package Arrays;

import java.util.Arrays;

public class Repl177 {
	public static int[] mergR(int[] a, int[] b) {
		int [] c = new int [a.length+ b.length];
		int index=0;
		for (int i = 0; i < a.length; i++) {
			c[index]= a[i];
			index++;
		}
		
		for (int j = 0; j < b.length; j++) {
			c[index+b.length]= a[j];
			index++;
		}
		return c;

	}// end mergR

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = {4,5,6 };
		
		int d[] = new int[a.length+ b.length];
		for (int i = 0; i < d.length; i++) {
			
		}
		
		System.out.println(Arrays.toString(mergR(a,b)));
		
	}
}
