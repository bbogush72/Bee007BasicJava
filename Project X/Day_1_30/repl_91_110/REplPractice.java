package repl_91_110;

public class REplPractice {

	public static void main(String[] args) {
		
		String str =" ABCjavaDEFjavaHiJjava";
		
		int count=0;
		for(int i=0; i<=str.length()-4; i++) {
			if(str.substring(i, i+4).equals("java")){
				count++;
			}else;
			
			
		}
		
		System.out.println("this string contains "+count+ " java words");

	}

}
