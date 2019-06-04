package repl_91_110;

public class CheckHowManyWords {

	public static void main(String[] args) {
		String a = "aaabbbcccdddeeeffftttXXXYYY";
		int count =0;
		
		for(int i =0; i<a.length()-3; i++) {
			if( a.substring(i, i+1).equalsIgnoreCase("t")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
