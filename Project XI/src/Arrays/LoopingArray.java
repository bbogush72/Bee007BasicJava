package Arrays;

public class LoopingArray {

	public static void main(String[] args) {

		String namesTR[] = {"Ben", "Sen", "O", "Biz", "Siz", "Onlar"};
		
		String[] namesEng  = {"I","You","He","She","it", "We", "You", "They" };
		
		
		for(int i=0; i<=namesTR.length+1; i++) {
			System.out.print(namesEng [i]+ " ");
		}
		for(int o=0; o<=namesTR.length-1; o++) {
			System.out.print(namesTR [o]+ " ");
		}
	}

}
