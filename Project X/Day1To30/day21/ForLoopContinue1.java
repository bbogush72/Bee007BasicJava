package day21;

public class ForLoopContinue1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 50; i+=2) {
			
			System.out.print(i + " ");
			
		

		}
		System.out.println();
		
		for (int i = 1; i <= 50; i++) {
			
			if(i%4==0) {
			System.out.print(i + " ");
			}
		

		}
		
	}

}
