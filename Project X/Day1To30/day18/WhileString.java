package day18;


import java.util.Scanner;
public class WhileString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Seviyorum de");
		
		String theAnswer = "";
		
		while(!(theAnswer.equalsIgnoreCase("seviyorum"))) {
			
			System.out.println("Seviyorum de ");
			
			theAnswer= scan.next();
			
			
		}
		System.out.println("Yalan Soyluyorsun,Yalancisin inanamam,Gayri sana guvenemem");
	}

}