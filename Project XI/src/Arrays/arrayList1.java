package Arrays;

public class arrayList1 {

	public static void main(String[] args) {

		String namesTR[] = {"Ben", "Sen", "O", "Biz", "Siz", "Onlar"};
		
		String[] namesEng  = {"I","You","He","She","it", "We", "You", "They" };
		
		
		for(int i=0; i<=namesTR.length-1; i++) {
			for(int o=0; o<=namesEng.length-1; o++) {
				
			System.out.print(namesTR [i]+", "+ namesEng[o]);
		}
			
		}
		
//		for(int o=0; o<=namesTR.length-1; o++) {
//			System.out.print(namesTR [o]+ " ");
//		}
	}

}
