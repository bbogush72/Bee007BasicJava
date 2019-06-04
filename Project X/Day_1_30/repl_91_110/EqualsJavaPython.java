package repl_91_110;

import java.util.Scanner;

public class EqualsJavaPython {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
sentence= sentence.replace(" ", "");
    
    String result="";
    int sumOfJava = 0;
    int sumPython=0;
    int i=0;
    int count = sentence.length();
    
   do {
	   sumOfJava++;
	   
	   sumPython++;
	   
	   i++;
   }
    	 while(sentence.substring(0, i+5).equals("java")&& (sentence.substring(0, i+6).equals("python")));
    	

    		if(sumOfJava==sumPython) 
    		
    		result ="true";
    		else 
    		result="false";
    		
    		
    		
    		
    		System.out.println(result);
    	}
    	
    	
    		
    	 
   
    }