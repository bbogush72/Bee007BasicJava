package day22;

public class StringPractice {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJ";
        
	    for(int x=0; x<str.length();x+=2) {
	    	
	    if (x != str.length()-1)	
	        
	System.out.print(str.substring(x,x+2)+" ");	
	    
	    else
	    	System.out.println(str.substring(x));
	    
	    
	    }

}
}