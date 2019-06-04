package Methods;

public class AppearsTwice {
	 public static void main(String[] args) {
	   System.out.println("Hello world!");
	 }

	 /**
	     * @param target - string that you need to check.
	     * @param sentence - string where you need to lookup for the target string.
	     * @return
	     */
	    public static boolean appearsTwice(String target, String sentence) {
	 

	       int count = 0;
	 for(int i=0; i<=sentence.length()-target.length();i++)
	 {
	   if(sentence.substring(i,i+target.length()).equalsIgnoreCase(target)){
	     //i+=target.length()-1;
	     count++;
	   }
	 }


	 if(count == 2) return true;
	     return false;
	   }
	}
