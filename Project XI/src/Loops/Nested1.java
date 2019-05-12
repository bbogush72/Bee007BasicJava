package Loops;


public class Nested1 {
	public static void main(String[] args) {
	
	
	for ( int a = 0 ; a<5; a++ ) {
		System.out.println("Iteration " + (a+1) );
        for (int b = 15; b>=5 ; b--)
        System.out.print(b + " ");
    }
}
}