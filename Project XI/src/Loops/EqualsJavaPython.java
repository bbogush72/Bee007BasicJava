package Loops;

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
    
   
    	 while(sentence.substring(0, i+5).equals("java"));{
    		 sumOfJava++;}
    	 while(sentence.substring(0, i+6).equals("python")) {
    		 sumPython++;
    	 }
    	 
    	
    	 
    	 
    		if(sumOfJava==sumPython) 
    		
    		result ="true";
    		else 
    		result="false";
    	
    		
    		
    		
    		System.out.println(result);
    	}
    	
    	
    		
    	 
   
    }
    
//   Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15]
//   and specifically designed to have as few implementation dependencies as possible.
    
  

