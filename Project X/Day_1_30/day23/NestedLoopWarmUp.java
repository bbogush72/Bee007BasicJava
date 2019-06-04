package day23;

public class NestedLoopWarmUp {

	public static void main(String[] args) {
		/*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         * 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         * */
		for(int i=1; i<6; i++) {
			System.out.print("java"+ " ");
			
		
		
		System.out.println();
		
		for(int i1=1; i1<=5; i1++) {
			System.out.print(i1+ " ");
			
		}
		System.out.println();
		}

		char firstA = 'A';
		char lastZ= 'Z';
		for(int i = 'A'; i<='Z'; i++) {
		for(int k = 'A'; k<=i; k++) {
			
		System.out.print((char)i+ " ");
		}
		System.out.println();
		
		
		}
		
		for (char x = 'A'; x <= 'Z'; x++) {
		      for (char y = 'A'; y <= x; y++) {
		        System.out.print(y + " ");
		      }
		      System.out.println();
		    }

	}

}
