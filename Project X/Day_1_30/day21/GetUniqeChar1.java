package day21;

public class GetUniqeChar1 {

	public static void main(String[] args) {
		String newStr = "";
		String str = "AAccBBBdEEEf";

		 System.out.println(str);
		    for (int i = 0; i < str.length(); i++) {
		    
		      String eachChar = str.charAt(i)+"" ; 
		      
		      if( newStr.contains( eachChar  )) {
		       
		    	  
		    	  System.out.println(eachChar + " duplicate");
		      }else {
		        newStr = newStr + eachChar ; 
		      }
		      
		    }
		    
		    System.out.println(newStr);
	}

}
