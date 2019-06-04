package Strings;

public class appearsTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accumulator a = new Accumulator(20);
	    System.out.println("Hello world!");
	  }
	  
	  /**
		 * @param target - string that you need to check.
		 * @param sentence - string where you need to lookup for the target string.
		 * @return 
		 */
		public static boolean appearsTwice(String target, String sentence) {
		sentence = sentence.toLowerCase();
		int count=0;
		for(int i=0; i<sentence.length()-1; i++) {
			for(int j=i+1; j<sentence.length(); j++) {
				if(sentence.charAt(i)==sentence.charAt(j))
					count++;
				
			}
		}
		
		if(count%2==0) {
			return true;
		}else {
			
			return false;
		}
		}
	
		
	}