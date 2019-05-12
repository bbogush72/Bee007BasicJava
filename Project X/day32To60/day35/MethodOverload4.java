package day35;

public class MethodOverload4 {

	public static void main(String[] args) {

		//create a few static method called addNums
		//first one take two numbers and add each, return int result
		//second one takes three numbers and add all, return as int value
		//third one takes four numbers and add all, do not return, print the result only
		
		    addNums(5, 5); 
		    
		    addNums(10, 20);
		    System.out.println();
		    addNums(3, 5, 8);
		    
		    addNums(300,100);
		    
		    
		    
		    
		    
		  }
		  
		  public static void addNums(int a, int b) {
		    System.out.println(a+b);
		  }
		  
		  public static void addNums(int sum, int a, int b, int c) {
			  sum=a+b+c;
		    System.out.println(sum);
		  }
		  
		  public static void addNums(int number,int a, int b) {
		    System.out.println("Sum equals "+ (number+a+b));
		  }
		
	}


