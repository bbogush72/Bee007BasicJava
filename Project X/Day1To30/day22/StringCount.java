package day22;

public class StringCount {

	public static void main(String[] args) {
		String str = "ABCDEBC";
		
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			count++;
		}
		System.out.println("total count of letters: "+count);
	}

}
