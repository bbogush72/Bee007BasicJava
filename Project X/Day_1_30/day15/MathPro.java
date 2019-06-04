package day15;
import java.util.Scanner;
public class MathPro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter width, length and height");
		
		int w, l = 2, h=4;
		
		/* 
		int w = input.nextInt();
		int l =input.nextInt();
		int h =input.nextInt();
		*/
				
		w=l+6;
		l=h+2;
		
		int times = w*l*h;
		if (times == 64) {
		
		System.out.println(w+ " "+ l + " "+ h);}else {
			System.out.println(w+ " "+ l + " "+ h);	
		}
		
		

	}

}
