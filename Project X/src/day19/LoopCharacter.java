package day19;

import java.util.Scanner;

public class LoopCharacter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        
        //ask user a word
        // for example Bilal ==> B-i-l-a-l
        
        
        //method 1
        System.out.print(name.charAt(0)+"-");
        System.out.print(name.charAt(1)+"-");
        System.out.print(name.charAt(2)+"-");
        System.out.print(name.charAt(3)+"-");
        System.out.print(name.charAt(4)+"-\n");
        
        
        
        //method 2
        int x = 0;
        while (x<5) { 
        	System.out.print(name.charAt(x++) + "-");
        	
        	  
        //method 3	
        for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-");
                
            }	
        }
	}

}
