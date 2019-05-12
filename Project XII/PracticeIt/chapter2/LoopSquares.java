package chapter2;

public class LoopSquares {

	public static void main(String[] args) {
		/*
		* Write a for loop that produces the following output: 
		* 1 4 9 16 25 36 49 64 81 100 
		*/
		int num =0;
		int increment =1;
		
		for(int i=1; i<=10; i++) {  //i=1.
			num= num+increment;		//num=1
			increment = increment+2;
			System.out.print(num+" ");
		}
	}

}
