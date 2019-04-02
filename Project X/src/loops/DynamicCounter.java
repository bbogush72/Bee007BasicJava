package loops;
import java.util.Scanner;
public class DynamicCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		int n=0;
		int input = scan.nextInt();
		
		while(n<=input) {
			
		//	n++;
			
			System.out.print(n++ +" ");
		}
		
		
		
	}

}
