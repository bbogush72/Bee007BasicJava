package day24;



import java.util.Arrays;
import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		
		Random rand = new Random();
		String [ ] names =new String [10];
		
		String i= rand.toString();
		System.out.println(i);
		
		for(int j=0; j<10; j++) {
			
			names[j]= rand.toString();
			
			
			
			
		}
		System.out.println(Arrays.toString(names));
		

	}

}
