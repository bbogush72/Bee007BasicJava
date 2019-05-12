package OCA;
import java.util.Arrays;
public class OCA1Test {
	
public static void main(String[] args) {
	




		  // int... arr = {1,2};
		
		/*
		  Question 01: 
		  
		 boolean Result = false ; 
		    
		  Which of the following will print  "Hello Batch 11"  ?
		  
		  A. while(Result) {  System.out.println("Hello Batch 11"); }
		  
		  B. do {  System.out.println("Hello Batch 11");  }  while(Result);   correct
		  			
		 */
		boolean a=false;
		do {
			System.out.println("Hello");
		} while(a); 	
		
//		while(true) {       // while loop is an reapeating if statment.
//			System.out.println("School");
//		}
		
		/*
		  Question 2: 
		  		String is: 
		  		   A. mutable                B. immutable.   correct
		  
		 */
		String str="Cybertek";
				str =	str.toUpperCase();
				System.out.println(str);
		
		
		
		/*
		 	Question 3: 
		 	     Which statement is true regarding while loop?
		 	      	A. the loop's body is only executed when the condition is true
		 	      	B. All standard for loops can be converted to while loop 
		 	      	C. All of them    // correct.
		 
		 */
				
				
		
		
		
		/*		
		 Question 04: 
		 
		 	String str="Cybertek";
		 			str.concat(" school");
		 			str.toLowerCase();
		 	System.out.println(str);
		 	
		 
		 */
				String str2="Cybertek";
	 			str2.concat(" school");
	 			str2.toLowerCase();
	 	System.out.println(str2);
		
		
		/*
		 Question 05:
		 what does replacefirst() method do in string?
		 	A. replaces the first occurrence  the given argument    correct
			B. replaces all the occurrences with the given argument 

		 		
		 */
		
		
		
		
		
		/*
		 	Question 06: 
		 		what is the correct syntax for java main method?
		 				A. public static void main(String() args) {  }
		 				
		 				B. public static void Main(String[] args) {   }
		 				
		 				C. public void main(String[] args) {     }
		 				
		 				D. public static void main(String[] args) {  }  correct.
		 
		 */
		
		
		/*
		 		Question07:
		 		  which one of the following is the incorrect syntax for java main method?
		 		   
		 		   A. static public void main(String[] arr) {    }
		 		   
		 		   B. public static void main(String arr[]) {    }
		 		   
		 		   C. public static void main(String... args) {    }
		 		   
		 		   D. public Main(String args) {   }      // correct
		 		   
		 */
		
		
		
		/*
		 Question 8:
		 	  which of the following will give compile error?
		 	  			
		 	  			A. int[] arr = {1, 2, 3};
		 	  			
		 	  			B. int arr[] = {22, 3, 4, 5};
		 	  			
		 	  			C. int[] arr=new int[3] {1,2,3,4};  // correct
		 				
		 				D. int[] arr=new int[] {1,2,3,4}; 
		 
		 
		 */
	 	int[] arr=new int[3];
	 	
	 	
	 	
		
		
		/*
		 
		 	Question 09:
		 		what's the result?
		 			int[] arr={2, 4, 6, 8, 10};
		 			
		 			for(int i=0; i<arr.length; i += 2 ){
		 			      System.out.println(arr[i]);
		 			      }		
		 			 
		 
		 */
	 	
	 	
	 	int[] arr8={2, 4, 6, 8, 10}; 
			//     0   1 2  3   4
			for(int i=0; i < 5; i += 2 ){ // 0, 2, 4
				
			      System.out.print(arr8[i]+", ");  //[2,6,10]
			      
			      }		
			
			
		
		/*
		 	Question 10: 
		 				int[] arr=new int[2];
		 					arr[0]=10;
		 					arr[1]=20;
		 					arr[2]=30;
		 			System.out.println(Arrays.toString(arr));
		 			A. [ 10, 20, 30]           B. [10, 20]
		 	correct		C. Throws an Exception     D. [0,0,0]
		 
		 */
			int[] arr2=new int[2];   // this array can only contain 2 elemnts
			
				arr2[0]=10;
				arr2[1]=20;
			//	arr2[2]=30;
				
		System.out.println(Arrays.toString(arr2));
		
		
		
		/*
		 	Question 11:
		 		 which one of the followings is true regarding the while loop?
		 	correct	 A. while loop checks the condition before executing the body   
		 	         B. while loop executes the body at least once before checking the condition
		 
		 */
		
		
		
		
		/*
		 	Question 12:
		 			 Which of the following will give Infinite loop ?
		 			 	A. for(int i=0; i< 10; i++) {  }
		 			 	
		 			 	B. for( int i=0; i< 10; )  {        i++;}
		 			 	
		 			 	C. int i=0;
		 			 		for( i=0; i<10; i++) {    }
		 			 	
		 			 	D. for(int i=0; i < 10; ) {     }    // correct.
	
		 
		 */
		
		// for(initilization; condition; ){         iterator}
		
		
		
		
		
		
		/*
		 	Question 13: 
		 		     int[] arr=new int[2];
		 		     		arr[0] = 10;
		 		     		arr[1] = 20;
		 		     System.out.println( arr );		
		 
		 
		 */
		
			int[] arr3=new int[2];
 					arr3[0] = 10;
 					arr3[1] = 20;
 			System.out.println( arr3 );	 // Arrays.toString();
			
		
		
	}
	 
}