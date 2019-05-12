package day21;

public class JavaSearch {

	public static void main(String[] args) {
		
		String sentence = " Java is fun, java is challenging";
		int count =0;
		for(int i = 0; i<sentence.length()-4 ; i++) {
			
			if(sentence.substring(i,i+4).equalsIgnoreCase("java")) {
				count++;
			}else;
			
			
		}
System.out.println("String contains "+count+ " java words");
	}

}
