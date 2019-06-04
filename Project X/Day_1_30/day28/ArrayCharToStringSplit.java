package day28;

import java.util.Arrays;

public class ArrayCharToStringSplit {

	public static void main(String[] args) {
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
        String [] strChar=  str.split(" ");
        
        System.out.println(Arrays.toString(strChar));
        
        String one = "Cybertek";
        
        char[] cyberChar = str.toCharArray();
        
        for(int i =0; i<cyberChar.length; i++) {
        	
        	for(int j = 0 ; j < cyberChar.length ; j++) {
                System.out.print(cyberChar[j] + "-");
                
              //  System.out.print(cyberChar[j]+ " - ");  
                
              }
              
                  
            }
      System.out.println();
}



}
          
            



