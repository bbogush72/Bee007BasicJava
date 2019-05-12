package day25;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		String movies[] = new String[4];
		movies[0] = "Life";
		movies[1] = "without";
		movies[2] = "love is";
		movies[3] = "meaningless";
		
		//if(movies[i].length()>max)
		//System.out.println(Arrays.toString(movies));
		
		for(int i=movies.length-1; i>=0; i--) {
			
			String s ="";
			
			for(int j=movies[i].length()-1; j>=0; j--) {
				s+=movies[i].charAt(j);
				
			}
			
			movies[i]=s;
			
		
			
		}
		System.out.println(Arrays.toString(movies));
			
	}
}