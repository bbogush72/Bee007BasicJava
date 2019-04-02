package loops;
import java.util.Scanner;
public class GiveMeFive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x =0;
		
		while(x!=5) {
			
			System.out.println("Give me five!");
			x=scan.nextInt();
		}
		
		System.out.println("Good job!");

	}

}
